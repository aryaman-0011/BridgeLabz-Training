package com.day_6.fleetmanager;

import java.util.*;

public class MergeSort {

	public static List<Vehicle> mergeSort(List<Vehicle> list) {
		
		if(list.size() <= 1) {
			return list;
		}
		
		int mid = list.size() / 2;
		
		List<Vehicle> left = mergeSort(list.subList(0, mid));
		List<Vehicle> right = mergeSort(list.subList(mid, list.size()));
		
		return merge(left, right);
	}
	
	private static List<Vehicle> merge(List<Vehicle> left, List<Vehicle> right) {
		List<Vehicle> result = new ArrayList<Vehicle>();
		
		int i = 0, j = 0;
		
		while(i < left.size() && j < right.size()) {
			if(left.get(i).mileage <= right.get(j).mileage) {
				result.add(left.get(i));
				i++;
			} else {
				result.add(right.get(j));
				j++;
			}
		}
		
		while(i < left.size()) {
			result.add(left.get(i++));
		}
		
		while(j < right.size()) {
			result.add(right.get(j++));
		}
		
		return result;
	}
}
