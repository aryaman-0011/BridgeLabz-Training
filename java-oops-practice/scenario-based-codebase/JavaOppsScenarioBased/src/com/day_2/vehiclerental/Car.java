package com.day_2.vehiclerental;

public class Car extends Vehicle {
	public Car(String vehicleId, String brand, double baseRate) {
		super(vehicleId, brand, baseRate);
	}
	
	@Override
	public double calculateRent(int days) {
		double carCharge = 500;
		return (baseRate * days) + carCharge;
	}
}
