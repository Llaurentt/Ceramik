package co.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Evenement;
import co.simplon.service.EvenementService;

@RestController
@RequestMapping(value="/evenements")
public class EvenementController {
	@Autowired
	private EvenementService service;
	
	@PostMapping
	public Evenement saveEvenement(@RequestBody Evenement evenement) {
		return service.saveEvenement(evenement);
	}
	
	@GetMapping
	public List<Evenement> listEvenement() {
		return service.listEvenement();
	}
	
	@PutMapping
	public Evenement updateEvenement(@RequestBody Evenement evenement) {
		return service.updateEvenement(evenement);
	}
	
	@DeleteMapping
	public void deleteEvenement(Long id) {
		service.deleteEvenement(id);
	}
	
	@GetMapping(value="titre")
	public Evenement unEvenement(String titre) {
		return service.unEvenement(titre);
	}

}
