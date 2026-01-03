/*
6. "CabbyGo – A Ride-Hailing App in the Making"
Story: You’ve joined a startup building CabbyGo, a ride-hailing app. You're tasked with building
the backend logic for managing vehicles, drivers, and ride booking.
Requirements:
● Vehicle (class): fields like vehicleNumber, capacity, type.
● Driver (class): fields like name, licenseNumber, rating.
● Constructors to initialize vehicles and drivers.
● An IRideService interface with methods like bookRide() and endRide().
● Use encapsulation to hide sensitive data like location, fare.
● Implement polymorphism with different vehicle types like Mini, Sedan, SUV (all extend
Vehicle).

● Use operators to calculate fare: baseFare + distance * rate.



● Apply access modifiers carefully: private for rating and fare, public methods to
read data.
 */


package com.day_3.cabbygo;

public class CabbyMain {

    public static void main(String[] args) {

        Driver driver = new Driver("Rohit", "DL12345", 4.8);

        Vehicle mini = new Mini("UP32AB1234");
        Vehicle sedan = new Sedan("UP32CD5678");

        IRideService rideService = new RideService();

        rideService.bookRide(driver, mini, 10);
        rideService.endRide();

        System.out.println();

        rideService.bookRide(driver, sedan, 8);
        rideService.endRide();
    }
}
