package co.simplon.service;

import java.util.List;

import co.simplon.modele.Adresse;

public interface AdresseService {
	public Adresse saveAdresse(Adresse adresse);
	public List<Adresse> listAdresse();

}
