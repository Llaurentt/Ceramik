package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.modele.Technique;

public interface TechniqueDao extends JpaRepository<Technique, Long> {

}
