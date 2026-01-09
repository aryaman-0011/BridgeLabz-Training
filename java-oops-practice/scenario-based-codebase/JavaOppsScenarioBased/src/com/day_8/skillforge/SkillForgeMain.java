package com.day_8.skillforge;

import java.util.List;

public class SkillForgeMain {
	
	public static void main(String[] args) {
		
		Instructor instructor = new Instructor("Vishal sir", "vishal@gmail.com");
		Student student = new Student("Aryaman", "aryaman@gmail.com");
		
		Course course = new AdvancedCourse("Java Full Stack", instructor, List.of("Core", "OOP", "Collections"));
		
        for (int i = 0; i < course.modules.size(); i++) {
            student.completeModule(course.modules.size());
        }

        System.out.println("Progress: " + student.getProgress() + "%");

        // Certification
        if (student.getProgress() >= 100) {
            course.generateCertificate(student);
        }
	}
}
