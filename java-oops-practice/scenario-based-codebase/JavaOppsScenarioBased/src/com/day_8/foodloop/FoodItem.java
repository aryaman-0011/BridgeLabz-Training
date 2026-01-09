package com.day_8.foodloop;

public abstract class FoodItem {
	
	protected String name;
	protected String category;
	
	private double price;
	private int availability;
	
	public FoodItem(String name, String category, double price, int availability) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.availability = availability;
	}
	
	
	public boolean isAvailable() {
		return availability > 0;
	}
	
	public void reduceStock() {
		if (availability > 0) {
			availability--;
		}
	}
	
	public double getPrice() {
		return price;
	}
}
