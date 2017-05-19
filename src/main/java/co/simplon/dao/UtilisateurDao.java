package co.simplon.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.simplon.domain.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
	public Page<Utilisateur> findAll(Pageable pageable);
	@Query("select u from Utilisateur u where u.nom like :x")
	public Page<Utilisateur> chercherUtilisateurs(@Param("x") String nom, Pageable pageable);
} 
