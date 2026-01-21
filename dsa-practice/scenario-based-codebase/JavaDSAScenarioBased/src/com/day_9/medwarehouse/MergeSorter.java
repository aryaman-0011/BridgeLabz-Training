package com.day_9.medwarehouse;

public class MergeSorter {

	public static void mergeSort(Medicine[] arr, int left, int right) {
		
		if(left < right) {
			
			int mid = left + (right - left) / 2;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			
			merge(arr, left, mid, right);
		}
	}
	
	
	private static void merge(Medicine[] arr, int left, int mid, int right) {
		
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		Medicine[] leftArr = new Medicine[n1];
		Medicine[] rightArr = new Medicine[n2];
		
		for(int i = 0; i < n1; i++) {
			leftArr[i] = arr[left + i];
		}
		
		for(int j = 0; j < n2; j++) {
			rightArr[j] = arr[mid + 1 + j];
		}
		
		int i = 0, j = 0, k = left;
		
		while(i < n1 && j < n2) {
			if(leftArr[i].getExpiryDate().compareTo(rightArr[j].getExpiryDate()) <= 0) {
				arr[k++] = leftArr[i++];
			} else {
				arr[k++] = rightArr[j++];
			}

		}
		
		while(i < n1) {
			arr[k++] = leftArr[i++];
		}
		
		while(j < n2) {
			arr[k++] = rightArr[j++];
		}
		
	}
}
