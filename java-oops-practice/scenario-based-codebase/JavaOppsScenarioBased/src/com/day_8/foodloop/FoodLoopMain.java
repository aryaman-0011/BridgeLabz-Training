package com.day_8.foodloop;

import java.util.*;

public class FoodLoopMain {

	public static void main(String[] args) {
		
		FoodItem food1 = new NonVegItem("Chicken Shawarma", 250, 5);
		FoodItem food2 = new VegItem("Dosa", 300, 3);
		FoodItem food3 = new VegItem("Idli", 150, 10);
		
		List<FoodItem> combo = new ArrayList<>();
		combo.add(food1);
		combo.add(food2);
		combo.add(food3);
		
		Order order = new Order(combo);
		
		order.placeOrder();
	}
}
