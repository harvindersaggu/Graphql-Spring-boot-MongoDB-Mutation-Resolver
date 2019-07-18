package com.example.OrderService.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.OrderService.entity.Order;
import com.example.OrderService.entity.Product;
import com.example.OrderService.service.OrderService;

@Component
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	private OrderService orderService;

	public Order save(String id, String customerId, String productId) {
		return orderService.order(id, customerId, productId);
	}

	public Order saves(String id, String customerId, String productId, Product products) {
		return orderService.orders(id, customerId, productId, products);
	}

	public Order update(String id, String customerId) {
		return orderService.update(id, customerId);
	}

	public String delete(String id) {
		orderService.delete(id);
		return "Deleted";
	}
}
