package fr.ludiv.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.ludiv.entities.Product;
import fr.ludiv.services.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping()
	private List<Product> getAllProduct() {
		return productService.findAllProduct();		
	}
	
	@GetMapping("/{id}")
	private Product getProductById(@PathVariable("id") Long id) {
		return productService.findByIdProduct(id);
	}
	
	@PostMapping()
	private void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@PutMapping("/{id}")
	private Product updateProduct(@PathVariable("id") long id, @RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	@DeleteMapping("/{id}")
	private void DeleteProduct(@PathVariable("id") long id) {
		productService.deleteProduct(id);
	}
	
	

}
