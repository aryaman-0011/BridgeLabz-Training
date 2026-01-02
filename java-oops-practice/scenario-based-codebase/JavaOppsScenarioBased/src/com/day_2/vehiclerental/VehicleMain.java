package com.day_2.vehiclerental;

public class VehicleMain {
	public static void main (String[] args) {
		
		Vehicle bike = new Bike("UP93AR4455", "Royal Enfield", 300);
		Vehicle car = new Car("UP93AM2295", "Mahindra", 500);
		Vehicle truck = new Truck("UP93UT1455", "Tata", 800);
		
		int days = 3;
		
		System.out.println("Bike Rent: " + bike.calculateRent(days));
		System.out.println("Car Rent: " + car.calculateRent(days));
		System.out.println("Truck Rent: " + truck.calculateRent(days));
	}
}
