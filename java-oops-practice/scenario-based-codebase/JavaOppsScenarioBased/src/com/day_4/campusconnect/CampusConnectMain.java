package com.day_4.campusconnect;

public class CampusConnectMain {
	public static void main (String[] args) {
		
		Faculty faculty = new Faculty(101, "Dr. Vishal", "vishal@gmail.com", "Java");
		
		Course javaCourse = new Course("Core Java", faculty);
		
		double[] grades = {8.5, 9, 9.6};
		
		Student student = new Student(1, "Aryaman", "aryaman@gmail.com", grades);
		
		student.enrollCourse(javaCourse);
		
		Person p1 = student;
		Person p2 = faculty;
		
		p1.printDetails();
		System.out.println();
		p2.printDetails();
		System.out.println();
		
		javaCourse.printCourseDetails();
	}
}
