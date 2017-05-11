package co.simplon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.CeramisteDao;
import co.simplon.domain.Ceramiste;

@Service
public class CeramisteServiceImpl implements CeramisteService{
	@Autowired
	private CeramisteDao ceramisteDao;

	@Override
	public Ceramiste saveCeramiste(Ceramiste ceramiste) {
		return ceramisteDao.save(ceramiste);
	}

	@Override
	public List<Ceramiste> listCeramiste() {
		return ceramisteDao.findAll();
	}

	@Override
	public Ceramiste getCeramiste(Long id) {
		return ceramisteDao.findOne(id);
	}
}
