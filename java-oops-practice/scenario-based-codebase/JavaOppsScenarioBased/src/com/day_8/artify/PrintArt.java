package com.day_8.artify;

public class PrintArt extends ArtWork {

	public PrintArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}
	
	@Override
	public void license() {
		System.out.println("Digital art is for commercial use only");
	}
}
