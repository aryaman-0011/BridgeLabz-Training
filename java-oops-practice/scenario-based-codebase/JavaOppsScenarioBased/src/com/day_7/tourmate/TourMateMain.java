package com.day_7.tourmate;

public class TourMateMain {

	public static void main(String[] args) {
		Transport flight = new Transport(15000);
		Hotel airBNB = new Hotel(3000, 5);
		Activity rafting = new Activity(5000);
		
		
		Trip trip1 = new DomesticTrip("Manali", 5, flight, airBNB, rafting);
		
		trip1.showTripDetails();
		trip1.book();
		trip1.cancel();
		
		System.out.println();
		
		Trip trip2 = new InternationalTrip("Malaysia", 7, flight, airBNB, rafting);
		
		trip2.showTripDetails();
		trip2.book();

	}
}
