package com.example.OrderService.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order")
public class Order {
	private String id;
	private String customerId;
	private String productId;
	private Customer customer;
	private Product product;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Order(String id, Customer customer, Product product) {
		super();
		this.id = id;
		this.customer = customer;
		this.product = product;
	}

	public Order(String id, String customerId, String productId, Customer customer, Product product) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.productId = productId;
		this.customer = customer;
		this.product = product;
	}

	public Order(String id2, String custId) {
		System.out.println("Order object created ");
	}

	public Order() {
		System.out.println("Object created");
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + customer + ", product=" + product + "]";
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
