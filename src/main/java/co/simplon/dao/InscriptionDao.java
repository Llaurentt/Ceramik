package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.modele.Inscription;

public interface InscriptionDao extends JpaRepository<Inscription, Long> {

}
