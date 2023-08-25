package com.aurionpro.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		
		Product product1 = new Product (1,"DELL",100,10);
		Product product2 = new Product (2,"HP",100,10);
		
		LineItem lineitem1 = new LineItem(1, 2, product2);
		LineItem lineitem2 = new LineItem(2, 3, product1);
		
		
		List<LineItem> items = new ArrayList<>();	
		items.add(lineitem1);
		items.add(lineitem2);
	
	Order order = new Order(1, LocalDate.now(), items);
	List<Order> orders = new ArrayList<>();
	orders.add(order);
	Customer customer = new Customer(1, "Yash", orders);
	
	
	double OrderTotal = order.calculateOrderPrice();
	System.out.println(customer);
	
	
		
	}

	}

