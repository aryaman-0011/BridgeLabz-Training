package com.day_2.patientmanagement;

public class PatientManagementMain {
	public static void main (String[] args) {
		Doctor doctor = new Doctor("Dr. Vishal", "Cardiology");
		doctor.displayInfo();
		
		System.out.println();
		
		Patient p1 = new InPatient(001, "Ishu", 22, 6);
		Patient p2 = new OutPatient(002, "ROhan", 30);
		
		p1.displayInfo();
		p2.displayInfo();
		
		System.out.println();
		System.out.println(p1.getSummary());
		
		System.out.println();
		
		Bill bill = new Bill(10000);
		
		System.out.println("Total Bill Amount: " + bill.calculatePayment());
	}
}
