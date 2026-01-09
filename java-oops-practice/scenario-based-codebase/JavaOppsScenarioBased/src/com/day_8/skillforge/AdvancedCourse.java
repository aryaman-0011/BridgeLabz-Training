package com.day_8.skillforge;

import java.util.*;

public class AdvancedCourse extends Course{

	public AdvancedCourse(String title, Instructor instructor, List<String> modules){
		super(title, instructor, modules);
	}
	
	@Override
	public void generateCertificate(Student student) {
		System.out.println("Advanced certificate awarded to: " + student.name);
	}
}
