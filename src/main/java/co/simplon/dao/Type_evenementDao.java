package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.domain.TypeEvenement;

public interface Type_evenementDao extends JpaRepository<TypeEvenement, Long> {

}
