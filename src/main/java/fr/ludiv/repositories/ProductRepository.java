package fr.ludiv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.ludiv.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
