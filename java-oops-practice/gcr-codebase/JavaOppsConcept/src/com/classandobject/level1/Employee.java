package com.classandobject.level1;

public class Employee {
	// Non-static variable
	String name;
	int id;
	double salary;
	
	// Constructor
	Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	// Creating method to display employee details
	public void displayEmployee() {
		System.out.println("Employee name: " + name);
		System.out.println("Employee id: " + id);
		System.out.println("Employee salary: " + salary);
	}
	
	public static void main (String[] args) {
		Employee emp = new Employee("Rohan", 1, 500000); // Calling constructor
		emp.displayEmployee(); // Calling the display method
	}
}
