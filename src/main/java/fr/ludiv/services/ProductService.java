package fr.ludiv.services;

import java.util.List;

import fr.ludiv.entities.Product;

public interface ProductService {
	
	public void addProduct(Product product);
	
	public void deleteProduct(Product product);
	
	public void updateProduct(Product product);
	
	public List<Product> findAllProduct();
	
	Product findByIdProduct(Long product_id);
	

}
