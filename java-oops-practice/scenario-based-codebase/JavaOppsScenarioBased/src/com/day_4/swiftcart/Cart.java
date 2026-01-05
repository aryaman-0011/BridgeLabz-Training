package com.day_4.swiftcart;

import java.util.*;

public class Cart implements ICheckout {
	
	private Map<Product, Integer> items = new HashMap<>();
	private double totalPrice;
	
	Cart() {};
	
	Cart (Map<Product, Integer> items) {
		this.items.putAll(items);
		calculateTotal();
	}
	
	public void addProduct(Product product, int quantity) {
		items.put(product, quantity);
		calculateTotal();
	}
	
	private void calculateTotal() {
		totalPrice = 0;
		for(Map.Entry<Product, Integer> entry : items.entrySet()) {
			totalPrice += entry.getKey().getDiscountedPrice(entry.getValue());
		}
	}
	
	public double applyDiscount(double couponAmount) {
		totalPrice = totalPrice - couponAmount;
		return totalPrice;
	}
	
	@Override
	public void generateBill() {
		System.out.println("\n----- SwiftCart Bill -----");
		for (Map.Entry<Product, Integer> entry : items.entrySet()) {
		System.out.println(entry.getKey().name + " x " + entry.getValue());
		}
		System.out.println("Total Payable: " + totalPrice);
	}
	
}
