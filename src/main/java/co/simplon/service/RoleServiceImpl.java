package co.simplon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.RoleDao;
import co.simplon.domain.Role;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleDao roleDao;

	@Override
	public Role saveRole(Role role) {
		return roleDao.save(role);
	}

	@Override
	public List<Role> listRole() {
		return roleDao.findAll();
	}

	@Override
	public Role getRole(Long id) {
		return roleDao.findOne(id);
	}

	@Override
	public Role updateRole(Long id, Role role) {
		role.setId(id);
		return roleDao.save(role);
	}

	@Override
	public void deleteRole(Long id) {
		roleDao.delete(id);
		
	}

}
