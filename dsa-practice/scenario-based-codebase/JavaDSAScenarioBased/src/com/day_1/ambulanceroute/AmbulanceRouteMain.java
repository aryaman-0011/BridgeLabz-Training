package com.day_1.ambulanceroute;


public class AmbulanceRouteMain {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", true);

        route.displayUnits();

        route.routePatient();

        route.removeUnit("Surgery");

        route.displayUnits();

        route.routePatient();
    }
}
