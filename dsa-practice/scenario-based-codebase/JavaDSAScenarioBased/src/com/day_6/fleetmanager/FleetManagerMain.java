package com.day_6.fleetmanager;

import java.util.*;

public class FleetManagerMain {

	public static void main(String[] args) {
		
		List<Vehicle> depotAList = Arrays.asList(
				new Vehicle(101, 12000),
				new Vehicle(102, 18000),
				new Vehicle(103, 25000)
			);
		
		
		List<Vehicle> depotBList = Arrays.asList(
                new Vehicle(201, 15000),
                new Vehicle(202, 22000),
                new Vehicle(203, 30000)
			);
		
		Depot depotA = new Depot("Depot A", depotAList);
		Depot depotB = new Depot("Depot B", depotBList);
		
		List<Vehicle> masterList = new ArrayList<Vehicle>();
		masterList.addAll(depotA.getVehicles());
		masterList.addAll(depotB.getVehicles());
		
		List<Vehicle> maintenanceSchedule = MergeSort.mergeSort(masterList);
		
		
		System.out.println("Master vehicle schedule");
		for(Vehicle v : maintenanceSchedule) {
			System.out.println(v);
		}
	}
}
