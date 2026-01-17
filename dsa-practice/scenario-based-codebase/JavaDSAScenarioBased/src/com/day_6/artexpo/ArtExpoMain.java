/*
9. ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: At an art exhibition, artists register throughout the day. The system continuously adds
each entry and maintains a sorted list by registration time for booth assignment. Insertion Sort
fits well due to the incremental nature.
Key Concepts:
● Real-time insertion
● Nearly sorted data
● Time-based ordering
*/

package com.day_6.artexpo;

public class ArtExpoMain {

	public static void main(String[] args) {
		
		ArtExpoManager expo = new ArtExpoManager(10);
		
		expo.registerArtist("Vishal", 1011);
		expo.registerArtist("Bhuvan", 1000);
		expo.registerArtist("Aryaman", 1001);
		expo.registerArtist("Kartik", 2000);

		System.out.println("Artists sorted by registration time: ");
		expo.displayArtists();
	}
}
