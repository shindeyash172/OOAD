package com.aurionpro.model;

import java.util.List;

public class Customer {
private int id;
private String name;
private List<Order> orders;

public Customer(int id, String name, List<Order> orders) {
	super();
	this.id = id;
	this.name = name;
	this.orders = orders;
}
@Override
public String toString() {
	return "\nCustomer [id=" + id + ", name=" + name + ", orders=" + orders + "]";
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public List<Order> getOrders() {
	return orders;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setOrders(List<Order> orders) {
	this.orders = orders;
}
}
