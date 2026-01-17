package com.day_6.fleetmanager;

public class Vehicle {

	int vehicleId;
	int mileage;
	
	public Vehicle(int vehicleId, int mileage) {
		this.vehicleId = vehicleId;
		this.mileage = mileage;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle{id = " + vehicleId + " mileage = " + mileage + "}";
	}
}
