package com.day_8.foodfest;

public class MergeSort {

	public static void mergeSort(Stall[] arr, int left, int right) {
		
		if (left < right) {
			
			int mid = left + (right - left) / 2;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			
			merge(arr, left, mid, right);
		}
	}
	
	private static void merge(Stall[] arr, int left, int mid, int right) {
		
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		Stall[] leftSide = new Stall[n1];
		Stall[] rightSide = new Stall[n2];
		
		for(int i = 0; i < n1; i ++) {
			leftSide[i] = arr[left + i];
		}
		
		for(int j = 0; j < n2; j++) {
			rightSide[j] = arr[mid + 1 + j];
		}
		
		int i = 0, j = 0, k = left;
		
		while(i < n1 && j < n2) {
			if(leftSide[i].footFall <= rightSide[j].footFall) {
				arr[k++] = leftSide[i++];
			} else {
				arr[k++] = rightSide[j++];
			}
		}
		
		while(i < n1) {
			arr[k++] = leftSide[i++];
		}
		
		while(j < n2) {
			arr[k++] = rightSide[j++];
		}
	}
}
