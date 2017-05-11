package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.domain.Technique;

public interface TechniqueDao extends JpaRepository<Technique, Long> {

}
