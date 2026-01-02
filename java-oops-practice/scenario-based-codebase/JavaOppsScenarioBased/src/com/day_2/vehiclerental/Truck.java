package com.day_2.vehiclerental;

public class Truck extends Vehicle {
	public Truck(String vehicleId, String brand, double baseRate) {
		super(vehicleId, brand, baseRate);
	}
	
	@Override
	public double calculateRent(int days) {
		double truckCharge = 1000;
		return (baseRate * days) + truckCharge;
	}
}
