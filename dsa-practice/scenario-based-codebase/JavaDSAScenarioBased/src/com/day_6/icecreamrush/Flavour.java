package com.day_6.icecreamrush;

public class Flavour {

	String name;
	int sold;
	
	public Flavour(String name, int sold) {
		this.name = name;
		this.sold = sold;
	}
	
	@Override
	
	public String toString() {
		return name + " : " + sold;
	}
}
