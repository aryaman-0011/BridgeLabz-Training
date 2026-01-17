package com.day_6.artexpo;

public class ArtExpoManager {

	private Artist[] artists;
	private int count;
	
	public ArtExpoManager(int capacity) {
		artists = new Artist[capacity];
		count = 0;
	}
	
	public void registerArtist(String name, long time) {
		artists[count] = new Artist(name, time);
		count++;
		
		InsertionSort.sortByRegistrationTime(artists, count);
	}
	
	public void displayArtists() {
		for(int i = 0; i < count; i++) {
			System.out.println(artists[i]);
		}
	}
}
