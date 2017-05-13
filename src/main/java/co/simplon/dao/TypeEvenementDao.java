package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.domain.TypeEvenement;

public interface TypeEvenementDao extends JpaRepository<TypeEvenement, Long> {

}
