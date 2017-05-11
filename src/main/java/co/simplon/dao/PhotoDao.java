package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.domain.Photo;

public interface PhotoDao extends JpaRepository<Photo, Long> {

}
