package com.day_10.songorganizer;

public class Song {

	int trackId;
	String songName;
	
	public Song(int trackId, String songName) {
		this.trackId = trackId;
		this.songName = songName;
	}
	
	@Override
	public String toString() {
		return trackId + " : " + songName;
	}
}
