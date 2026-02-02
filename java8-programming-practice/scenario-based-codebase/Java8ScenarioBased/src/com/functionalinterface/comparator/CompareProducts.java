package com.functionalinterface.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Product {
	String name;
	int price;
	
	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
}


public class CompareProducts {
	
	public static void main(String[] args) {
		
		List<Product> list = Arrays.asList(
				
				new Product("Monitor", 20000),
				new Product("Laptop", 90000),
				new Product("PS5", 80000)
		);
		
		Comparator<Product> byPrice = (p1, p2) -> p1.price - p2.price;
		
		list.sort(byPrice);
		list.forEach(p -> System.out.println(p.name + "Price: " + p.price));
	}
}
