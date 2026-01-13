package com.day_9.gamebox;

public abstract class Game implements IDownloadable {

	protected String title;
	protected String genre;
	protected double price;
	protected double rating;

	protected Game(String title, String genre, double price) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = 0.0;
	}

	public double getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public void applySeasonalOffer(double discountPercent) {
		price = price - (price * discountPercent / 100);
	}
}
