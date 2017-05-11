package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.domain.Stage;

public interface StageDao extends JpaRepository<Stage, Long> {

}
