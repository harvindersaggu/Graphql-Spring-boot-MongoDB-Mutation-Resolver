package com.example.OrderService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OrderService.entity.Order;
import com.example.OrderService.entity.Product;
import com.example.OrderService.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> getOrders() {
		return orderRepository.findAll();
	}

	public Order getOrderById(String id) {
		return orderRepository.findById(id).orElseThrow((RuntimeException::new));
	}

	public Order orders(String id, String customerId, String productId,Product products) {
		Order order = new Order();
		order.setId(id);
		order.setCustomerId(customerId);
		order.setProductId(productId);
		return orderRepository.save(order);

	}

	public Order order(String id, String customerId, String productId) {
		Order order = new Order();
		order.setId(id);
		order.setCustomerId(customerId);
		order.setProductId(productId);
		return orderRepository.save(order);

	}

	public Order update(String id, String customerId) {
		Order order = getOrderById(id);
		order.setCustomerId(customerId);
		return orderRepository.save(order);

	}

	public String delete(String id) {
		Order order = getOrderById(id);
		orderRepository.delete(order);
		return "Deleted";
	}

}
