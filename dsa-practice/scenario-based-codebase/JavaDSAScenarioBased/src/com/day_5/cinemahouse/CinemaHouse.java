package com.day_5.cinemahouse;

public class CinemaHouse {
	

	
	
	public static void main(String[] args) {
		
		int[] showTimes = {18, 10, 22, 14, 20, 9};
		
		System.out.println("Before sorting:");
		printShows(showTimes);
		
		BubbleSort.sort(showTimes);
		
		System.out.println("Aster shorting:");
		printShows(showTimes);
		
	}
	
	static void printShows(int[] shows) {
		for(int time : shows) {
			System.out.println(time + " ");
		}
		System.out.println();
	}
}
