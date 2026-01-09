package com.day_8.artify;

public abstract class ArtWork implements IPurchasable {
	
	protected String title;
	protected String artist;
	private double price;
	protected String  licenseType;
	protected boolean hasPreview;
	
	
	// Constructor initialized without preview
	public ArtWork(String title, String artist, double price, String licenseType) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		this.hasPreview = false;
	}
	
	public ArtWork(String title, String artist, double price, String licenseType, boolean hasPreview) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		this.hasPreview = hasPreview;
	}
	
	
	@Override
	public void purchase(User user) {
		
		if (user.deductBalance(price)) {
			System.out.println(user + " purchased artwork " + title);
		}
	}
	
	public void showDetails() {
		System.out.println("Title: " + title);
		System.out.println("Artist: " + artist);
		System.out.println("Price: " + price);
	}
	
	
}
