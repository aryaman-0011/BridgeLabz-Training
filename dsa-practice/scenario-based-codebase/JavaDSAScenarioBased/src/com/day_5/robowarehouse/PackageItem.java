package com.day_5.robowarehouse;

public class PackageItem {
	
	private int weight;
	
	public PackageItem(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return String.valueOf(weight);
	}
}
