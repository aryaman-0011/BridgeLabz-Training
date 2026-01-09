package com.day_8.skillforge;

public class BeginnerCourse extends Course {
	public BeginnerCourse(String title, Instructor instructor) {
		super(title, instructor);
	}
	
	@Override
	public void generateCertificate(Student student) {
		System.out.println("Beginner Certificate awarded to: " + student.name);
	}
}
