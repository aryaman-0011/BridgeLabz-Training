package com.day_2.trafficmanager;

public class Vehicle {

	String number;
	Vehicle next;
	
	Vehicle(String number) {
		this.number = number;
		this.next = null;
	}
}
