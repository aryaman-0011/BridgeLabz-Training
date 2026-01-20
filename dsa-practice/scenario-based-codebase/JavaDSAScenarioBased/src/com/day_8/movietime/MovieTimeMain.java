package com.day_8.movietime;

public class MovieTimeMain {

	public static void main(String[] args) {
		
		Show[] shows = new Show[5];
		
		shows[0] = new Show("Transformers", 600);
		shows[1] = new Show("Road House", 660);
		shows[2] = new Show("Faster", 720);
		
		int count = 3;
		
		shows[count++] = new Show("Terminator", 690);
		InsertionSort.sortByShowTIme(shows, count);
		
		shows[count++] = new Show("Fast and furous", 750);
		InsertionSort.sortByShowTIme(shows, count);
		
		for(int i = 0; i < count; i++) {
			System.out.println(shows[i]);
		}
	}
}
