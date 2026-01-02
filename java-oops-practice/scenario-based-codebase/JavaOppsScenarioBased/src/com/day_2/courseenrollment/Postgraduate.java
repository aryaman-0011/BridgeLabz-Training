package com.day_2.courseenrollment;

public class Postgraduate extends Student {
	public Postgraduate(String studentId, String name) {
		super(studentId, name);
	}
	
	@Override
	public String getLevel() {
		return "Postgraduate";
	}
}
