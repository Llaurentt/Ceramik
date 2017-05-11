package co.simplon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.domain.Role;

public interface RoleDao extends JpaRepository<Role, Long> {

}
