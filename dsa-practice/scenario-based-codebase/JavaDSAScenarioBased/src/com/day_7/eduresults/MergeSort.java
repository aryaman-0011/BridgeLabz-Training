package com.day_7.eduresults;

public class MergeSort {

	public static void mergeSort(Student[] arr, int left, int right) {
		
		if(left < right) {
			
			int mid = left + (right - left) / 2;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			
			merge(arr, left, mid, right);
		}
	}
	
	public static void merge(Student[] arr, int left, int mid, int right) {
		
		int k1 = mid - left + 1;
		int k2 = right - mid;
		
		Student[] leftSide = new Student[k1];
		Student[] rightSide = new Student[k2];
		
		for(int i = 0; i < k1; i ++) {
			leftSide[i] = arr[left + i];
		}
		
		for(int j = 0; j < k2; j++) {
			rightSide[j] = arr[mid + 1 + j];
		}
		
		int i = 0, j = 0, k = left;
		
		while(i < k1 && j < k2) {
			if(leftSide[i].marks >= rightSide[j].marks) {
				arr[k++] = leftSide[i++];
			} else {
				arr[k++] = rightSide[j++];
			}
		}
		
		
		while(i < k1) {
			arr[k++] = leftSide[i++];
		}
		
		while(j < k2) {
			arr[k++] = rightSide[j++];
		}
		
	}
}
