package co.simplon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.AdresseDao;
import co.simplon.domain.Adresse;

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

	@Override
	public Adresse updateAdresse(Long id, Adresse adresse) {
		adresse.setId(id);
		return adresseDao.save(adresse);
	}

	@Override
	public void deleteAdresse(Long id) {
		adresseDao.delete(id);
		
	}

	@Override
	public Adresse getAdresse(Long id) {
		return adresseDao.findOne(id);
	}

	@Override
	public List<Adresse> findByVille(String ville) {
		return adresseDao.findByVille(ville);
	}

}
