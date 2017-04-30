package co.simplon.service;

import java.util.List;

import co.simplon.modele.Utilisateur;

public interface UtilisateurService {
	public Utilisateur saveUtilisateur(Utilisateur utilisateur);
	public List<Utilisateur> listUtilisateur();
}
