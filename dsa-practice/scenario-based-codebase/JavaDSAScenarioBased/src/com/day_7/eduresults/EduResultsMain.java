package com.day_7.eduresults;

public class EduResultsMain {

	public static void main(String[] args) {
		
		Student[] students = {
				new Student(1, "Aryaman", 98, "Jhansi"),
				new Student(2, "Harsh", 80, "Bhopal"),
				new Student(3, "Gaurav", 95, "Mauranipur"),
				new Student(4, "Aryan", 88, "Aurangabad")
		};
		
		System.out.println("Before sorting: ");
		for(Student s : students) {
			System.out.println(s);
		}
		
		MergeSort.mergeSort(students, 0, students.length - 1);
		
		System.out.println("\nAfter sorting:");
		for(Student s : students) {
			System.out.println(s);
		}
	}
}
