package com.day_7.eduresults;

public class Student {

	int id;
	String name;
	int marks;
	String district;
	
	public Student(int id, String name, int marks, String district) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.district = district;
	}
	
	public String toString() {
		return name + " | " + marks + " | " + district;
	}
	
}
