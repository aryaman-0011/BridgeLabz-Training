package com.day_3.parceltracker;

public class Stage {

	String name;
	Stage next;
	
	Stage(String name) {
		this.name = name;
		this.next = null;
	}
}
