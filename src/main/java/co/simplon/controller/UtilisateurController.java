package co.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.modele.Utilisateur;
import co.simplon.service.UtilisateurService;

@RestController
@RequestMapping(value="/utilisateurs")
public class UtilisateurController {
	@Autowired
	private UtilisateurService utilisateurService;
	
	@PostMapping
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurService.saveUtilisateur(utilisateur);
	}
	@GetMapping
	public List<Utilisateur> listUtilisateur() {
		return utilisateurService.listUtilisateur();
	}
	

}
