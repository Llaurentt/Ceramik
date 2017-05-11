package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.domain.Evenement;

public interface EvenementDao extends JpaRepository<Evenement, Long> {
	public Evenement findByTitre(String titre);

}
