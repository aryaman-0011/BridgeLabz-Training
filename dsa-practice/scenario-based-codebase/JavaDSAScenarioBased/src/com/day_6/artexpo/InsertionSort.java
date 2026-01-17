package com.day_6.artexpo;

public class InsertionSort {

	public static void sortByRegistrationTime(Artist[] artists, int size) {
		
		for(int i = 1; i < size; i++) {
			
			Artist key = artists[i];
			int j = i - 1;
			
			while(j >= 0 && artists[j].registrationTime > key.registrationTime) {
				artists[j + 1] = artists[j];
				j--;
			}
			
			artists[j + 1] = key;
		}
	}
}
