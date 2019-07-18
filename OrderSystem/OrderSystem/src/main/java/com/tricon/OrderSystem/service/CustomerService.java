package com.tricon.OrderSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.OrderSystem.entity.Customer;
import com.tricon.OrderSystem.repository.ProductRepository;

@Service
public class CustomerService {

	@Autowired
	private ProductRepository customerRepository;

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public Customer getCustomerId(String id) {
		return customerRepository.findById(id).orElseThrow((RuntimeException::new));
	}

	public Customer save(String id, String email, String password) {
		Customer cust = new Customer();
		cust.setId(id);
		cust.setEmail(email);
		cust.setPassword(password);
		return customerRepository.save(cust);
	}

	public Customer update(String id, String email, String password) {
		Customer cust = getCustomerId(id);
		cust.setId(id);
		cust.setEmail(email);
		cust.setPassword(password);
		return customerRepository.save(cust);

	}

	public void delete(String id) {
		customerRepository.deleteById(id);
	}
}
