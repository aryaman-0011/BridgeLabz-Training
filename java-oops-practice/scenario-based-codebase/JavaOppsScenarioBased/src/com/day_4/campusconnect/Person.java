package com.day_4.campusconnect;

public abstract class Person {
	protected int id;
	protected String name;
	protected String email;
	
	Person(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	abstract void printDetails();
}
