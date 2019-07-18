package com.tricon.OrderSystem.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.tricon.OrderSystem.entity.Customer;
import com.tricon.OrderSystem.service.CustomerService;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private CustomerService customerService;

	public List<Customer> getCustomers() {
		return customerService.getAllCustomers();
	}

	public Customer getCustomerById(String id) {
		return customerService.getCustomerId(id);
	}
}
