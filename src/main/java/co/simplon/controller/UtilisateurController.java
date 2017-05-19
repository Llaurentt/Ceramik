package co.simplon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.simplon.dao.UtilisateurDao;
import co.simplon.domain.Utilisateur;

@Controller
@RequestMapping(value="/utilisateur")
public class UtilisateurController {
	@Autowired
	private UtilisateurDao utilisateurDao;
	
	@RequestMapping(value="/index")
	// Spring injecte par defaut un model dans lequel on peut stocker les resultats qu'on veut afficher
	// @RequestParam: demande à DispatcherServlet de chercher dans l'objet Request(request.getParameter) 
	// un parametre "page" et l'affecte à p. Si meme nom que p, facultatif, mais interessant 
	//car on peut mettre une valeur par défaut
	public String Index(Model model, 
			@RequestParam(name="page", defaultValue="0") int p,
			@RequestParam(name="motCle", defaultValue="") String nom){
//		Page<Utilisateur> pageUtilisateurs = utilisateurDao.findAll(new PageRequest(p, 1));
		Page<Utilisateur> pageUtilisateurs = utilisateurDao.chercherUtilisateurs("%"+nom+"%", new PageRequest(p, 1));
		int nbrPages = pageUtilisateurs.getTotalPages();
		int[] pages = new int[nbrPages];
		for (int i=0; i < nbrPages; i++){
			pages[i] = i;
		}
		model.addAttribute("pages", pages);
		model.addAttribute("pageCourante", p);
		model.addAttribute("pageUtilisateurs", pageUtilisateurs);
		model.addAttribute("motcle", nom);
		return "utilisateurs";
	}

}
