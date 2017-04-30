package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.modele.Photo;

public interface PhotoDao extends JpaRepository<Photo, Long> {

}
