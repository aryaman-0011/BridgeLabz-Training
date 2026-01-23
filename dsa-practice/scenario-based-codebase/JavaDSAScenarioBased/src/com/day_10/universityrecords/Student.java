package com.day_10.universityrecords;

public class Student {

	int rollNumber;
	String stuName;
	
	public Student( int rollNumber, String stuName) {
		this.rollNumber = rollNumber;
		this.stuName = stuName;
	}
	
	@Override
	public String toString() {
		return stuName + " : " + rollNumber;
	}
}
