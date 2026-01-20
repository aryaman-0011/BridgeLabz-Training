package com.day_8.movietime;

public class Show {

	String movieName;
	int showTime;
	
	public Show(String movieName, int showTime) {
		this.movieName = movieName;
		this.showTime = showTime;
	}
	
	@Override
	public String toString() {
		int hours = showTime / 60;
		int minutes = showTime % 60;
		
		return movieName + " - " + String.format("%02d:%02d", hours, minutes);
	}
}
