package com.day_4.swiftcart;

public class NonPerishableProduct extends Product {
	
	NonPerishableProduct(String name, double price) {
		super(name, price, "Non Perishable");
	}
	
	@Override
	double getDiscountedPrice(int quantity) {
		return price * quantity;
	}
}
