package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.simplon.domain.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
	@Query("select u from Utilisateur u where u.nom like :x")
	public Utilisateur getUtilisateurMC(@Param("x") String mc);

}
