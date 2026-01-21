package com.day_9.medwarehouse;

public class Medicine {

	String name;
	String expiryDate;
	
	public Medicine(String name, String expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}
	
	public String getExpiryDate() {
		return expiryDate;
	}
	
	@Override
	public String toString() {
		return name + " : " + expiryDate;
	}
}
