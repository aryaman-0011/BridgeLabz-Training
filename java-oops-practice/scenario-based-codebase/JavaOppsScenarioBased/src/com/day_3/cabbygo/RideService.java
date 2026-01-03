package com.day_3.cabbygo;

public class RideService implements IRideService {

    private double fare;          // hidden
    private boolean rideActive;

    private final double baseFare = 50.0;

    @Override
    public void bookRide(Driver driver, Vehicle vehicle, double distance) {

        fare = baseFare + (distance * vehicle.getRatePerKm());
        rideActive = true;

        System.out.println("Ride Booked");
        System.out.println("Driver: " + driver.getName());
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        rideActive = false;
        System.out.println("Ride Ended");
    }
}

