package com.day_2.courseenrollment;

public abstract class Student {
	protected String studentId;
	protected String name;
	private double gpa; // Encapsulated
	
	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
		this.gpa = 0.0;
	}
	
	protected void calculateGpa(double totalGrades, int courseCount) {
		if (courseCount > 0) {
			this.gpa = totalGrades / courseCount;
		}
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public abstract String getLevel();
}
