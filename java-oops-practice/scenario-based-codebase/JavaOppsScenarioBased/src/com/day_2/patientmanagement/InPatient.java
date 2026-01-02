package com.day_2.patientmanagement;

public class InPatient extends Patient {
	private int daysAdmitted;
	
	public InPatient(int id, String name, int age, int daysAdmitted) {
		super(id, name, age);
		this.daysAdmitted = daysAdmitted;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("InPatient: " + name + ", Days Admitted: " + daysAdmitted);
	}
}
