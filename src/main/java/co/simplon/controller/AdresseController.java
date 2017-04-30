package co.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.modele.Adresse;
import co.simplon.service.AdresseService;

@RestController
public class AdresseController {
	// Pour faire l'injection de dépendance
	@Autowired
	private AdresseService adresseService; // utiliser delegate methods pour générer fonctions
	
	// Norme RestFull pour gérer une ressources ici les adresses: "/adresses" et
	// POST: ajouter / GET: consulter / PUT: mise à jour / DELETE : supprimer
	// @RequestBody: on indique à Spring qu'on lui envoie les données  
	// sous format json dans le corps de la requete
	@RequestMapping(value="/adresses", method=RequestMethod.POST)
	//@ResponseBody => le resultat va etre généré dans le corps de la réponse en json
	//mais comme on a spécifié @RestController pas besoin, si c'était @Controller: oui
	public Adresse saveAdresse(@RequestBody Adresse adresse) {
		return adresseService.saveAdresse(adresse);
	}
	
	@RequestMapping(value="/adresses", method=RequestMethod.GET)
	public List<Adresse> listAdresse() {
		return adresseService.listAdresse();
	}	

}
