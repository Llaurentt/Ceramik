package co.simplon.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.domain.Evenement;

public interface EvenementDao extends JpaRepository<Evenement, Long> {
	public Evenement findByTitre(String titre);
	public List<Evenement> findByTypeEvenementId(Long typeEvenementId);

}
