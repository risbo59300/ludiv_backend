package fr.ludiv.services;

import java.util.List;

import fr.ludiv.entities.Users;


public interface UsersService {
	
	public void addUsers(Users user);
	
	public void deleteUsers(Long id);
	
	public Users updateUsers(Users user);
	
	public List<Users> findAllUsers();
	
	Users findUsersById(Long Users_id);	

}
