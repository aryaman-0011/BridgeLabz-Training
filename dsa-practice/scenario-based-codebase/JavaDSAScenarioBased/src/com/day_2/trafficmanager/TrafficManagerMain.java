package com.day_2.trafficmanager;

public class TrafficManagerMain {

	public static void main(String[] args) {
		
		TrafficManager manager = new TrafficManager();
		
		manager.arriveAtSignal("CAR-101");
		manager.arriveAtSignal("CAR-102");
		manager.arriveAtSignal("CAR-103");
		
		manager.enterRoundabout();
		manager.enterRoundabout();
		
		manager.displayRoundabout();
		
		manager.exitRoundabout("CAR-101");
		manager.displayRoundabout();
		
		manager.enterRoundabout();
		manager.displayRoundabout();
	}
}
