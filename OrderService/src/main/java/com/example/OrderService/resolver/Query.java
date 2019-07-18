package com.example.OrderService.resolver;

import java.net.MalformedURLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.OrderService.entity.Customer;
import com.example.OrderService.entity.Order;
import com.example.OrderService.entity.Product;
import com.example.OrderService.service.OrderService;

import io.aexp.nodes.graphql.Argument;
import io.aexp.nodes.graphql.Arguments;
import io.aexp.nodes.graphql.GraphQLRequestEntity;
import io.aexp.nodes.graphql.GraphQLResponseEntity;
import io.aexp.nodes.graphql.GraphQLTemplate;

@Component
public class Query implements GraphQLQueryResolver {

	private GraphQLTemplate graphQLTemplate = new GraphQLTemplate();
	private final String productUrl = "http://localhost:8085/graphql";
	private final String customertUrl = "http://localhost:8086/graphql";

	@Autowired
	private OrderService orderService;

	public List<Order> getAllOrders() {
		return orderService.getOrders();
	}

	public Object buildResponse(String url, Arguments arguments, Class classs)
			throws IllegalStateException, MalformedURLException {
		GraphQLRequestEntity requestEntity = GraphQLRequestEntity.Builder().url(url).arguments(arguments)
				.request(classs).build();
		System.out.println("requestEntity " + requestEntity.getRequest());
		GraphQLResponseEntity<Object> responseEntity = graphQLTemplate.query(requestEntity, classs);
		System.out.println("responseEntity.getResponse() " + responseEntity.getResponse());
		return responseEntity.getResponse();
	}

	public Order getOrderById(String id) throws IllegalStateException, MalformedURLException {
		Order order = orderService.getOrderById(id);
		Arguments arguments = new Arguments("getCustomerById", new Argument<String>("id", order.getCustomerId()));
		order.setCustomer((Customer) buildResponse(customertUrl, arguments, Customer.class));
		System.out.println("-------------");
		arguments = new Arguments("getProductById", new Argument<String>("id", order.getProductId()));
		order.setProduct((Product) buildResponse(productUrl, arguments, Product.class));

		return order;
	}

}
