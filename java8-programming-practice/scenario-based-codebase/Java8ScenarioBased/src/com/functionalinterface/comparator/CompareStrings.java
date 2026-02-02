package com.functionalinterface.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareStrings {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Aryaman", "Harsh", "Ishu");
		
		Comparator<String> byLength = (s1, s2) -> s1.length() - s2.length();
		
		list.sort(byLength);
		list.forEach(System.out::println);
	}
}
