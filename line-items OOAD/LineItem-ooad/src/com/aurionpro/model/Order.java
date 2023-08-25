package com.aurionpro.model;

import java.time.LocalDate;
import java.util.List;

public class Order {
private int id;
private LocalDate Date;
private List<LineItem> items;
private double price;

public Order(int id, LocalDate date, List<LineItem> items) {
	super();
	this.id = id;
	Date = date;
	this.items = items;
	this.price =  calculateOrderPrice();
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getId() {
	return id;
}
public LocalDate getDate() {
	return Date;
}
@Override
public String toString() {
	return "\nOrder [id=" + id + ", Date=" + Date + ", items=" + items + ", price=" + price + "]";
}
public List<LineItem> getItems() {
	return items;
}
public void setId(int id) {
	this.id = id;
}
public void setDate(LocalDate date) {
	Date = date;
}
public void setItems(List<LineItem> items) {
	this.items = items;

}
public double calculateOrderPrice() {
	double totalOrderPrice = 0.0;
	for(LineItem item :items) {
		totalOrderPrice += item.calculateLineItemCost();
	}
	return totalOrderPrice;
	
}
}
