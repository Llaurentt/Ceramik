package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.modele.Role;

public interface RoleDao extends JpaRepository<Role, Long> {

}
