package co.simplon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.EvenementDao;
import co.simplon.domain.Evenement;

@Service
public class EvenementServiceImpl implements EvenementService {
	@Autowired
	private EvenementDao dao;

	@Override
	public Evenement saveEvenement(Evenement evenement) {
		return dao.save(evenement);
	}

	@Override
	public List<Evenement> listEvenement() {
		return dao.findAll();
	}

	@Override
	public Evenement updateEvenement(Evenement evenement) {
		
		return dao.save(evenement);
	}

	@Override
	public void deleteEvenement(Long id) {
		dao.delete(id);
	}

	@Override
	public Evenement unEvenement(String titre) {
		return dao.findByTitre(titre);
	}
}
