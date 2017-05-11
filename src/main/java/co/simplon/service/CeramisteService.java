package co.simplon.service;

import java.util.List;

import co.simplon.domain.Ceramiste;

public interface CeramisteService {
	public Ceramiste saveCeramiste(Ceramiste ceramiste);
	public List<Ceramiste> listCeramiste();
	public Ceramiste getCeramiste(Long id);

}
