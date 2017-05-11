package co.simplon.service;

import java.util.List;

import co.simplon.domain.Role;

public interface RoleService {
	public Role saveRole(Role role);
	public List<Role> listRole();
	public Role getRole(Long id);
	public Role updateRole(Long id, Role role);
	public void deleteRole(Long id);
}
