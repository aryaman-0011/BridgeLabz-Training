package com.day_5.cropmonitor;

public class QuickSort {

	public static void sort(SensorReading[] arr, int low, int high) {
		
		if(low < high) {
			int pivotIndex = partition(arr, low, high);
			sort(arr, low, pivotIndex - 1);
			sort(arr, pivotIndex + 1, high);
		}
	}
	
	private static int partition(SensorReading[] arr, int low, int high) {
		
		long pivot = arr[high].timeStamp;
		int i = low - 1;
		
		for (int j = low; j < high; j++) {
			if(arr[j].timeStamp < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		
		swap(arr, i + 1, high);
		return i + 1;
	}
	
	private static void swap(SensorReading[] arr, int i, int j) {
		SensorReading temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
}
