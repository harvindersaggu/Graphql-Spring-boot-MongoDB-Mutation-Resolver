package com.example.OrderService.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

@GraphQLProperty(name = "getProductById", arguments = { @GraphQLArgument(name = "id", type = "String") })
public class Product implements Serializable {
	@Id
	private String id;
	private String productName;
	private int quantity;
	private String category;
	private long cost;
	private String description;

	Product() {
		System.out.println("Product Object created");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public Product(String _id, String productName, int quantity, String category, long cost, String description) {
		super();
		this.id = _id;
		this.productName = productName;
		this.quantity = quantity;
		this.category = category;
		this.cost = cost;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [_id=" + id + ", productName=" + productName + ", quantity=" + quantity + ", category="
				+ category + ", cost=" + cost + ", description=" + description + "]";
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
