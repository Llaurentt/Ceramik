package co.simplon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.EvenementDao;
import co.simplon.domain.Evenement;

@Service
public class EvenementServiceImpl implements EvenementService {
	@Autowired
	private EvenementDao evenementDao;

	@Override
	public Evenement saveEvenement(Evenement evenement) {
		return evenementDao.save(evenement);
	}
	
	@Override
	public List<Evenement> listEvenement() {
		return evenementDao.findAll();
	}

	@Override
	public Evenement updateEvenement(Evenement evenement) {
		return evenementDao.save(evenement);
	}

	@Override
	public void deleteEvenement(Long id) {
		evenementDao.delete(id);
	}

	@Override
	public Evenement getEvenement(String titre) {
		return evenementDao.findByTitre(titre);
	}

	@Override
	public List<Evenement> findByTypeEvenementId(Long typeEvenementId) {
		return evenementDao.findByTypeEvenementId(typeEvenementId);
	}

}
