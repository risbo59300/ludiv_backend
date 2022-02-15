package fr.ludiv.services;

import java.util.List;

import fr.ludiv.entities.Product;


public interface ProductService {
	
	public void addProduct(Product product);
	
	public void deleteProduct(Long id);
	
	public Product updateProduct(Product product);
	
	public List<Product> findAllProduct();
	
	Product findByIdProduct(Long product_id);
	
	public List<Product> findProductByNameContaining(String name);
	

}
