package com.day_2.patientmanagement;

public class Patient {
	protected int id;
	protected String name;
	protected int age;
	private String medicalHistory;
	
	public Patient(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.medicalHistory = "Private Data";
	}
	
	public String getSummary() {
		return "Patiend ID: " + id + ", Name: " + name + ", Age: " + age;
	}
	
	public void displayInfo() {
		System.out.println("Patient: " + name);
	}
}
