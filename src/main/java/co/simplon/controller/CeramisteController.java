package co.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Ceramiste;
import co.simplon.service.CeramisteService;

@RestController
@RequestMapping(value="/ceramiste")
public class CeramisteController {
	@Autowired
	CeramisteService ceramisteService;

	@PostMapping
	public Ceramiste saveCeramiste(@RequestBody Ceramiste ceramiste) {
		return ceramisteService.saveCeramiste(ceramiste);
	}

	@GetMapping
	public List<Ceramiste> listCeramiste() {
		return ceramisteService.listCeramiste();
	}
	
	@GetMapping("{id}")
	public Ceramiste getCeramiste(@PathVariable Long id) {
		return ceramisteService.getCeramiste(id);
	}
}
