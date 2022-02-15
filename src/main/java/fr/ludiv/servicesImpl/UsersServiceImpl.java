package fr.ludiv.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ludiv.entities.Users;
import fr.ludiv.repositories.UsersRepository;
import fr.ludiv.services.UsersService;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	UsersRepository usersRepository;

	@Override
	public void addUsers(Users user) {
		usersRepository.save(user);
	}

	@Override
	public Users updateUsers(Users user) {
		return usersRepository.save(user);
	}

	@Override
	public List<Users> findAllUsers() {
		return usersRepository.findAll();
	}

	@Override
	public Users findUsersById(Long users_id) {
		return usersRepository.findById(users_id).get();
	}
	
	@Override
	public void deleteUsers(Long id) {
		usersRepository.deleteById(id);
	}

}
