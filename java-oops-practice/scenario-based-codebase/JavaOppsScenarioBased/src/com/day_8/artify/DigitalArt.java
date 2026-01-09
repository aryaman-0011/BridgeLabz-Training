package com.day_8.artify;

public class DigitalArt extends ArtWork {
	
	public DigitalArt(String title, String artist, double price, String licenseType, boolean hasPreview) {
		super(title, artist, price, licenseType, hasPreview);
	}
	
	@Override
	public void license() {
		System.out.println("Digital art is licensed for online use");
	}
}
