package com.day_7.flashdealz;

public class Product {

	int id;
	String name;
	int discount;
	
	public Product(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}
	
	public String toString() {
		return name + " | " + discount + "%";
	}
}
