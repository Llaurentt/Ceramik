package co.simplon.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.domain.Adresse;

public interface AdresseDao extends JpaRepository<Adresse, Long>{
	public List<Adresse> findByVille(String ville);

}
