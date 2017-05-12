package co.simplon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.AdresseDao;
import co.simplon.dao.RoleDao;
import co.simplon.dao.UtilisateurDao;
import co.simplon.domain.Utilisateur;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{
	@Autowired
	private UtilisateurDao utilisateurDao;
	
	@Autowired
	private RoleDao roleDao;
	
	@Autowired
	private AdresseDao adresseDao;

	@Override
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurDao.save(utilisateur);
	}

	@Override
	public List<Utilisateur> listUtilisateur() {
//		List<Utilisateur> resultat = utilisateurDao.findAll();
		return utilisateurDao.findAll();
	}
//		List<Utilisateur> result = new ArrayList<>();
		
//		for (Utilisateur u : resultat){
//			
//			Utilisateur utilisateur = utilisateurDao.findOne(u.getId());
//			
//			Role role = roleDao.findOne(u.getRole().getId());
//		 		utilisateur.setRole(role);
//		 		
//		 	Adresse adresse = adresseDao.findOne(u.getAdresse().getId());
//				utilisateur.setAdresse(adresse);
//				
//				result.add(utilisateur);
//		}
//		
//		for (Utilisateur u : resultat){
//			Utilisateur utilisateur = new Utilisateur();
//				utilisateur.setId(u.getId());
//				utilisateur.setUsername(u.getUsername());
//				utilisateur.setPassword(u.getPassword());
//				utilisateur.setNom(u.getNom());
//				utilisateur.setPrenom(u.getPrenom());
//				utilisateur.setEmail(u.getEmail());
//				utilisateur.setTelephone(u.getTelephone());
//				utilisateur.setAvatar_utilisateur(u.getAvatar_utilisateur());
//				utilisateur.setActif(u.getActif());
//			
//			Role role = new Role();
//			 	role.setId(u.getRole().getId());
//		 		role.setNom(u.getRole().getNom());
//		 		utilisateur.setRole(role);
//		 	
//		 	Adresse adresse = new Adresse();
//	 			adresse.setId(u.getAdresse().getId());
//				adresse.setAdresse(u.getAdresse().getAdresse());
//				adresse.setCode_postal(u.getAdresse().getCode_postal());
//				adresse.setVille(u.getAdresse().getVille());
//				adresse.setPays(u.getAdresse().getPays());
//				utilisateur.setAdresse(adresse);
//
//				result.add(utilisateur);
//		}
//		return result;
//	}

	@Override
	public Utilisateur getUtilisateur(Long id) {
		return utilisateurDao.findOne(id);
	}

	@Override
	public Utilisateur getUtilisateurMC(String mc) {
		return utilisateurDao.getUtilisateurMC("%"+mc+"%");
	}

	@Override
	public Utilisateur updateUtilisateur(Long id, Utilisateur utilisateur) {
		utilisateur.setId(id);
		return utilisateurDao.save(utilisateur);
	}

}
