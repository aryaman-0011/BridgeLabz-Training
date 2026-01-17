package com.day_6.fleetmanager;

import java.util.*;

public class Depot {

	String depotName;
	List<Vehicle> vehicles;
	
	public Depot(String depotName, List<Vehicle> vehicles) {
		this.depotName = depotName;
		this.vehicles = vehicles;
	}
	
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
}
