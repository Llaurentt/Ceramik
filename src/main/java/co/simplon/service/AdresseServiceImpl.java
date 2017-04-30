package co.simplon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.AdresseDao;
import co.simplon.modele.Adresse;

@Service
public class AdresseServiceImpl implements AdresseService {
	@Autowired
	private AdresseDao adresseDao;
	@Override
	public Adresse saveAdresse(Adresse adresse) {
		return adresseDao.save(adresse);
	}

	@Override
	public List<Adresse> listAdresse() {
		return adresseDao.findAll();
	}

}
