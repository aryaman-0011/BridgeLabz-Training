package com.collections.setinterface.settosortedlist;

import java.util.*;

public class SetToSortedListMain {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(5);
		set.add(8);
		set.add(0);
		set.add(2);
		
		System.out.println("Input set: " + set);

		List<Integer> sortedList = SetToSortedList.setToSortedList(set);
		
		System.out.println("Sorted list: " + sortedList);
	}
}
