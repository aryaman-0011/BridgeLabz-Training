package com.day_8.movietime.foodfest;

public class Stall {

	String stallName;
	int footFall;
	
	public Stall(String stallName, int footFall) {
		this.stallName = stallName;
		this.footFall = footFall;
	}
	
	@Override
	public String toString() {
		return stallName + " : " + footFall;
	}
}
