package com.day_7.fitnesstracker;

public class BubbleSort {

	public static void bubbleSort(User[] users, int size) {
		
		for(int i = 0; i < size - 1; i++) {
			boolean swapped = false;
			
			for(int j = 0; j < size - i - 1; j++) {
				
				if(users[j].steps < users[j + 1].steps) {
					User temp = users[j];
					users[j] = users[j + 1];
					users[j + 1] = temp;
					swapped = true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
	}
}
