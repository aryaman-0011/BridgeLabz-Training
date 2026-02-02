package com.functionalinterface.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
	
	String name;
	double salary;
	
	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
}

public class CompareSalary {
	
	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee("Aryaman", 50000),
				new Employee("Harsh", 60000),
				new Employee("Vaibhav", 30000)
		);
		
		Comparator<Employee> bySalary = (e1, e2) -> Double.compare(e1.salary, e2.salary);
		
		list.sort(bySalary);
		list.forEach(e -> System.out.println(e.name + " Salary: " + e.salary));
	}

}
