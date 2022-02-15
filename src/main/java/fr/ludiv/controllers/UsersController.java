package fr.ludiv.controllers;

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

import fr.ludiv.entities.Users;
import fr.ludiv.services.UsersService;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	@GetMapping()
	private List<Users> getAllUsers() {
		return usersService.findAllUsers();		
	}
	
	@GetMapping("/{id}")
	private Users getUsersById(@PathVariable("id") Long id) {
		return usersService.findUsersById(id);
	}
	
	@PostMapping()
	private void addUsers(@RequestBody Users user) {
	
		usersService.addUsers(user);
		System.err.println(user);
	}
	
	@PutMapping("/{id}")
	private Users updateUsers(@PathVariable("id") long id, @RequestBody Users user) {
		return usersService.updateUsers(user);
	}
	
	@DeleteMapping("/{id}")
	private void DeleteUsers(@PathVariable("id") long id) {
		usersService.deleteUsers(id);
	}
	
}
