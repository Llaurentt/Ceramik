package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.modele.Evenement;

public interface EvenementDao extends JpaRepository<Evenement, Long> {

}
