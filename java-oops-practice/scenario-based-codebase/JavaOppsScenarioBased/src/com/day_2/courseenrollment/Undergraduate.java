package com.day_2.courseenrollment;

public class Undergraduate extends Student {
	public Undergraduate(String studentId, String name) {
		super(studentId, name);
	}
	
	@Override
	public String getLevel() {
		return "Undergraduate";
	}
}
