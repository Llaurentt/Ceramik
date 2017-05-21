package co.simplon.controller;

import java.io.File;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import co.simplon.dao.UtilisateurDao;
import co.simplon.domain.Utilisateur;

@Controller
@RequestMapping(value="/utilisateur")
public class UtilisateurController {
	@Autowired
	private UtilisateurDao utilisateurDao;
	// Variable imagesDir dans laquelle on injecte une propriete: ${dir.images} du fichier properties
	// On a externalisé la valeur de la propriete
	@Value("${dir.images}")
	private String imagesDir;
	
	// @GetMapping: Remplace @RequestMapping(methode=RequestMethde.GET)
	@GetMapping(value="/afficher")
	// Spring injecte par defaut un model dans lequel on peut stocker les resultats qu'on veut afficher
	// @RequestParam: demande à DispatcherServlet de chercher dans l'objet Request(request.getParameter) 
	// un parametre "page" et l'affecte à p. Si meme nom que p, facultatif, mais interessant 
	//car on peut mettre une valeur par défaut
	public String Afficher(Model model, 
			@RequestParam(name="page", defaultValue="0") int p,
			@RequestParam(name="motCle", defaultValue="") String nom){
//		Page<Utilisateur> pageUtilisateurs = utilisateurDao.findAll(new PageRequest(p, 1));
		Page<Utilisateur> pageUtilisateurs = utilisateurDao.chercherUtilisateurs("%"+nom+"%", new PageRequest(p, 4));
		int nbrPages = pageUtilisateurs.getTotalPages();
		int[] pages = new int[nbrPages];
		for (int i=0; i < nbrPages; i++){
			pages[i] = i;
		}
		model.addAttribute("pages", pages);
		model.addAttribute("pageCourante", p);
		model.addAttribute("pageUtilisateurs", pageUtilisateurs);
		model.addAttribute("motCle", nom);
		return "utilisateurs";
	}
	
	@GetMapping(value="/creationUtilisateur")
	public String creationUtilisateur(Model model){
		model.addAttribute("utilisateur", new Utilisateur());
		return "creationUtilisateur";
	}
	
	@PostMapping(value="/saveUtilisateur")
	//@Valid: quand on stocke les données dans utilisateur, si message erreur les met dans bindingresult
	public String save(@Valid Utilisateur utilisateur, 
			BindingResult bindingResult, 
			@RequestParam(name="photo") MultipartFile file) throws Exception{
		if (bindingResult.hasErrors()){
			return "creationUtilisateur";
		}
		// Ne pas mettre les fichiers dans static: tout le monde y aura accès, le mettre dans un dossier à part, dans une autre BD
		if (!(file.isEmpty())){ 
			// getOriginalFilename: permet de retourner le nom original de la photo
			utilisateur.setAvatar_utilisateur(file.getOriginalFilename());
			// Ne pas mettre de chemin en dur...si on change de machine....
			file.transferTo(new File(imagesDir+file.getOriginalFilename()));
		}
		utilisateurDao.save(utilisateur);
		return "redirect:afficher";
	}

}
