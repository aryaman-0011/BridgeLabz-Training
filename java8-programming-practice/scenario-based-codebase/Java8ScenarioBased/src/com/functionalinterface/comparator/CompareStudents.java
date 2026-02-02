package com.functionalinterface.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student{
	
	String name;
	int rank;
	
	Student(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}
	
}

public class CompareStudents {
	
	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("Aryaman", 1),
				new Student("Harsh", 4),
				new Student("Vaibhav", 2)
		);
		
		Comparator<Student> byRank = (s1, s2) -> s1.rank - s2.rank;
		list.sort(byRank);
		
		list.forEach(s -> System.out.println(s.name + "Rank: " + s.rank));
	}
	
}
