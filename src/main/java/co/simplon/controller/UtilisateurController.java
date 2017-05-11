package co.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Utilisateur;
import co.simplon.service.UtilisateurService;

@RestController
@RequestMapping(value="/utilisateur")
public class UtilisateurController {
	@Autowired
	private UtilisateurService utilisateurService;
	
	@PutMapping("{id}")
	public Utilisateur updateUtilisateur(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
		return utilisateurService.updateUtilisateur(id, utilisateur);
	}

	@GetMapping("{id}")
	public Utilisateur getUtilisateur(@PathVariable Long id) {
		return utilisateurService.getUtilisateur(id);
	}
	
	@GetMapping("{mc}")
	public Utilisateur getUtilisateurMC(@PathVariable String mc) {
		return utilisateurService.getUtilisateurMC(mc);
	}
	@PostMapping
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.saveUtilisateur(utilisateur);
	}
	@GetMapping
	public List<Utilisateur> listUtilisateur() {
		return utilisateurService.listUtilisateur();
	}

}
