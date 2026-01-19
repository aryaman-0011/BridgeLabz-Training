package com.day_7.flashdealz;

public class FlashDealzMain {

	public static void main(String[] args) {
		
		Product[] products = {
				new Product(1, "Laptop", 35),
				new Product(2, "RTX 4090", 60),
				new Product(3, "Console", 40),
				new Product(4, "Controller", 90),
				new Product(5, "RAM", 20)
		};
		
		System.out.println("Before sorting:");
		for(Product p : products) {
			System.out.println(p);
		}
		
		System.out.println();
		
		QuickSort.quickSort(products, 0, products.length - 1);
		
		System.out.println("After sorting:");
		for(Product p : products) {
			System.out.println(p);
		}
	}
	
}
