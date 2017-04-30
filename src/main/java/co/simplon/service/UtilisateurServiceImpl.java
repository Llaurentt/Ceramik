package co.simplon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.UtilisateurDao;
import co.simplon.modele.Utilisateur;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{
	@Autowired
	private UtilisateurDao utilisateurDao;

	@Override
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurDao.save(utilisateur);
	}

	@Override
	public List<Utilisateur> listUtilisateur() {
		return utilisateurDao.findAll();
	}

}
