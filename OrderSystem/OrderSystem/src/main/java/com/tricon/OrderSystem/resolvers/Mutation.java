package com.tricon.OrderSystem.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.tricon.OrderSystem.entity.Customer;
import com.tricon.OrderSystem.service.CustomerService;

@Component
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	private CustomerService customerService;

	public Customer save(String id, String email, String password) {
		return customerService.save(id, email, password);
	}

	public Customer update(String id, String email, String password) {
		return customerService.save(id, email, password);
	}

	public void delete(String id) {
		customerService.delete(id);
	}
}
