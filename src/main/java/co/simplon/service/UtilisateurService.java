package co.simplon.service;

import java.util.List;

import co.simplon.domain.Utilisateur;

public interface UtilisateurService {
	public Utilisateur saveUtilisateur(Utilisateur utilisateur);
	public List<Utilisateur> listUtilisateur();
	public Utilisateur getUtilisateur(Long id);
	public Utilisateur getUtilisateurMC(String mc);
	public Utilisateur updateUtilisateur(Long id, Utilisateur utilisateur);
}
