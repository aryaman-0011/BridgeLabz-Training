package com.day_2.traincompanion;

public class Compartment {

	String name;
	Compartment prev;
	Compartment next;
	
	Compartment(String name) {
		this.name = name;
		this.prev = null;
		this.next = null;
	}
}
