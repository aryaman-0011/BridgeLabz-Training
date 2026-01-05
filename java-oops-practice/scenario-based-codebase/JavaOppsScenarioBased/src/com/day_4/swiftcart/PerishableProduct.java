package com.day_4.swiftcart;

public class PerishableProduct extends Product {
	
	PerishableProduct(String name, double price) {
		super(name, price, "Perishable");
	}
	
	@Override
	double getDiscountedPrice(int quantity) {
		double total = price * quantity;
		return total = total - (total * 0.10);
	}
}
