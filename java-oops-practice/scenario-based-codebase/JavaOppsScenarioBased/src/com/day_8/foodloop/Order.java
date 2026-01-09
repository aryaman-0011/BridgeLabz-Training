package com.day_8.foodloop;

import java.util.*;

public class Order implements IOrderable {
	
	private List<FoodItem> items;
	private double total;
	
	public Order() {
		items = new ArrayList<>();
		total = 0;
	}
	
	public Order(List<FoodItem> items) {
		this.items = items;
		calculateTotal();
	}
	
	public void addItems(FoodItem item) {
		if(item.isAvailable()) {
			items.add(item);
			item.reduceStock();
		} else {
			System.out.println(item.name + " is out of stock!");
		}
	}
	
	public void calculateTotal() {
		total = 0;
		
		for (FoodItem item : items) {
			total = total + item.getPrice();
		}
		
		total = total - applyDiscount();
	}
	
	protected double applyDiscount() {
		if (total >= 1000) {
			return total * 0.15;
		} else if (total >=500) {
			return total * 0.10;
		} else {
			return 0;
		}
	}
	
	
	@Override
	public void placeOrder() {
		calculateTotal();
		System.out.println("Order placed successfully");
		System.out.println("Total Amount: " + total);
	}
	
	@Override
	public void cancelOrder() {
		items.clear();
		total = 0;
		System.out.println("Order cancelled");
	}
	
}
