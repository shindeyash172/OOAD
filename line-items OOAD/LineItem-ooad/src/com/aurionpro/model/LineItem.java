package com.aurionpro.model;

public class LineItem {
    private int id;
    private int quantity;
    private double price;
    private Product product;
    public LineItem(int id, int quantity, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.product = product;
        this.price = calculateLineItemCost();
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

    @Override
	public String toString() {
		return "\nLineItem [id=" + id + ", quantity=" + quantity + ", price=" + price + ", product=" + product + "]";
	}

	public Product getProduct() {
        return product;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double calculateLineItemCost() {
        double itemCost = quantity * product.calculateDiscountedPrice();
        return itemCost;
    }
}
