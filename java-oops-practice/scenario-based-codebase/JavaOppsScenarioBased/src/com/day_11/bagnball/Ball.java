package com.day_11.bagnball;

public class Ball {

	private int id;
	private String color;
	private String size;
	
	public Ball(int id, String color, String size) {
		this.id = id;
		this.color = color;
		this.size = size;
	}
	
	public String getBallDetails() {
		return "Ball ID: " + id + ", Color: " + color + ", Size: " + size;
	}
}
