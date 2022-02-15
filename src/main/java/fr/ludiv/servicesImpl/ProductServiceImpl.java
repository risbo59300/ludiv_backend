package fr.ludiv.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ludiv.entities.Product;
import fr.ludiv.repositories.ProductRepository;
import fr.ludiv.services.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product findByIdProduct(Long product_id) {
		return productRepository.findById(product_id).get();
	}
	
	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public List<Product> findProductByNameContaining(String name) {
		return productRepository.findProductByNameContaining(name);
	}

}
