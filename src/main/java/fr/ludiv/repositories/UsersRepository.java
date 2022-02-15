package fr.ludiv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ludiv.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
	
}
