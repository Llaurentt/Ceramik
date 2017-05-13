package co.simplon.service;

import java.util.List;

import co.simplon.domain.Evenement;

public interface EvenementService {
	public Evenement saveEvenement(Evenement evenement);
	public List<Evenement> listEvenement();
	public List<Evenement> findByTypeEvenementId(Long typeEvenementId);
	public Evenement updateEvenement(Evenement evenement);
	public void deleteEvenement(Long id);
	public Evenement getEvenement(String titre);

}
