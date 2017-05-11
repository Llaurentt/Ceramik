package co.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Role;
import co.simplon.service.RoleService;

@RestController
@RequestMapping(value="/role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	@PostMapping
	public Role saveRole(@RequestBody Role role) {
		return roleService.saveRole(role);
	}
	
	@GetMapping
	public List<Role> listRole() {
		return roleService.listRole();
	}
	@GetMapping("{id}")
	public Role getRole(@PathVariable("id") Long id) {
		return roleService.getRole(id);
	}
	
	@PutMapping("{id}")
	public Role updateRole(@PathVariable Long id, @RequestBody Role role) {
		return roleService.updateRole(id, role);
	}
	
	@DeleteMapping("{id}")
	public void deleteRole(@PathVariable Long id) {
		roleService.deleteRole(id);
	}	
}
