package com.tricon.Product.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.tricon.Product.entity.Product;
import com.tricon.Product.service.ProductService;

@Component
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	private ProductService productService;

	public Product save(String id, String productName, String category)  {
		return productService.save(id, productName, category);
	}

	public Product update(String id, String productName, String category)  {
		return productService.save(id, productName, category);
	}

	public String delete(String id) {
		productService.delete(id);
		return "Done";
	}
}
