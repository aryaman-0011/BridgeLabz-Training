package com.day_10.productinventory;

public class Product {

	int sku;
	String name;
	double price;
	
	public Product(int sku, String name, double price) {
		this.sku = sku;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "SKU: " + sku + ", " + name + " - " + price + "INR";
	}
}
