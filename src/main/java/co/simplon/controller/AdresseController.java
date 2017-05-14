package co.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Adresse;
import co.simplon.service.AdresseService;

// controlleur qui utilise la norme restfull : par défaut retourne du json, pas besoin de mettre @RequestBody
@RestController
@RequestMapping(value="/adresses")
public class AdresseController {
	// Pour faire l'injection de dépendance
	@Autowired
	private AdresseService adresseService; // utiliser delegate methods pour générer fonctions
	
	// Norme RestFull pour gérer une ressources ici les adresses: "/adresses" et
	// POST: ajouter / GET: consulter / PUT: mise à jour / DELETE : supprimer
	// @RequestBody: on indique à Spring qu'on lui envoie les données  
	// sous format json dans le corps de la requete
	//@RequestMapping(value="/adresses", method=RequestMethod.POST) -> @PostMapping
	//@ResponseBody => le resultat va etre généré dans le corps de la réponse en json
	//mais comme on a spécifié @RestController pas besoin, si c'était @Controller: oui
	
	@PostMapping
	public Adresse saveAdresse(@RequestBody Adresse adresse) {
		return adresseService.saveAdresse(adresse);
	}
	
	@GetMapping
	public List<Adresse> listAdresse() {
		return adresseService.listAdresse();
	}	
	
	@GetMapping("{id}")
	public Adresse getAdresse(@PathVariable("id") Long id) {
		return adresseService.getAdresse(id);
	}
	
	@GetMapping("ville")
	public List<Adresse> findByVille(@RequestParam String ville) {
		return adresseService.findByVille(ville);
	}

	@PutMapping("{id}")
	public Adresse updateAdresse(@PathVariable("id") Long id, @RequestBody Adresse adresse){
		return adresseService.updateAdresse(id, adresse);
	}

	@DeleteMapping("{id}")
	public void deleteAdresse(@PathVariable("id") Long id) {
		adresseService.deleteAdresse(id);
	}
}
