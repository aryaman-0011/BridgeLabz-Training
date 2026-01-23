/*
Story: University's Digital Record System
The university needs an efficient way to manage student records searchable by roll number.
Scenarios:
● 🔹 Scenario 1: Insertion — As students enroll, insert their roll numbers with personal
details.
● 🔹 Scenario 2: Deletion — If a student leaves, remove their record.
● 🔹 Scenario 3: Search & Display — A professor wants a sorted list of student roll
numbers for attendance.
*/

package com.day_10.universityrecords;

public class StudentRecordsMain {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(new Student(1, "Aryaman"));
		bst.insert(new Student(2, "Aryan"));
		bst.insert(new Student(12, "Yash"));
		bst.insert(new Student(9, "Vishal"));
		
		System.out.println("Sorted student");
		bst.display();
		
		System.out.println("Search roll number 9");
		System.out.println(bst.search(9));
		
		
		System.out.println("Deleted " + bst.delete(9));
		bst.display();
	}
}
