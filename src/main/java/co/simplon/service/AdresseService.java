package co.simplon.service;

import java.util.List;

import co.simplon.domain.Adresse;

public interface AdresseService {
	public Adresse saveAdresse(Adresse adresse);
	public List<Adresse> listAdresse();
	public List<Adresse> findByVille(String ville);
	public Adresse getAdresse(Long id);
	public Adresse updateAdresse(Long id, Adresse adresse);
	public void deleteAdresse(Long id);
}
