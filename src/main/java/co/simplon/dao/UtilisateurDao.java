package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.domain.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
} 
