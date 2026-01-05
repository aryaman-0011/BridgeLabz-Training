package com.day_4.swiftcart;

public abstract class Product {
	protected String name;
	protected double price;
	protected String category;
	
	Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	abstract double getDiscountedPrice(int quantity);
}
