package com.day_2.courseenrollment;

public class Faculty {
	private String facultyId;
	private String name;
	
	public Faculty(String facultyId, String name) {
		this.facultyId = facultyId;
		this.name = name;
	}
	
	public void gradeStudent(Enrollment enrollment, double grade) {
		enrollment.assignGrade(grade);
	}
}
