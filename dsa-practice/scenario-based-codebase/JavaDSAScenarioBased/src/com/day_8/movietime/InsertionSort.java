package com.day_8.movietime;

public class InsertionSort {

	public static void sortByShowTIme(Show[] shows, int n) {
		
		for(int i = 1; i < n; i++) {
			Show key = shows[i];
			int j = i - 1;
			
			while(j >= 0 && shows[j].showTime > key.showTime) {
				shows[j + 1] = shows[j];
				j--;
			}
			
			shows[j + 1] = key;
		}
	}
}
