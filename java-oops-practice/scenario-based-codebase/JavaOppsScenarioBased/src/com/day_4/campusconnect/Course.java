package com.day_4.campusconnect;

import java.util.*;

public class Course {
	private String courseName;
	private Faculty faculty;
	private List<Student> students;
	
	Course(String courseName, Faculty faculty) {
		this.courseName = courseName;
		this.faculty = faculty;
		this.students = new ArrayList<>();
	}
	
	void addStudent (Student student) {
		students.add(student);
	}
	
	void removeStudent (Student student) {
		students.remove(student);
	}
	
	void printCourseDetails() {
		System.out.println("Course: " + courseName);
		System.out.println("Faculty: " + faculty.name);
		System.out.println("Enrolled Students: " + students.size());
	}
}
