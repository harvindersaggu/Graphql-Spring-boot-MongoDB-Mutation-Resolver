package com.tricon.Product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.Product.entity.Product;
import com.tricon.Product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product getProductId(String id) {
		return productRepository.findById(id).orElseThrow((RuntimeException::new));
	}

	public Product save(String id, String productName, String category) {
		Product product = new Product();
		product.setId(id);
		product.setProductName(productName);
		product.setCategory(category);
		return productRepository.save(product);
	}

	public Product update(String id, String productName, String category) {
		Product product = getProductId(id);
		product.setId(id);
		product.setProductName(productName);
		product.setCategory(category);
		return productRepository.save(product);

	}

	public void delete(String id) {
		productRepository.deleteById(id);
	}
}
