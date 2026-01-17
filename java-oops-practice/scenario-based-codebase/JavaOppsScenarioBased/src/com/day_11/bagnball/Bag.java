package com.day_11.bagnball;

import java.util.ArrayList;

public class Bag {
	
	private int id;
	private String color;
	private int capacity;
	private ArrayList<Ball> balls;
	
	public Bag(int id, String color, int capacity) {
		this.id = id;
		this.color = color;
		this.capacity = capacity;
		this.balls = new ArrayList<Ball>();
	}
	
	public void addBall(Ball ball) {
		if(balls.size() < capacity) {
			balls.add(ball);
			System.out.println("Ball added to Bag " + id);
		} else {
			System.out.println("Bag " + id + " id FULL!");
		}
	}
	
	public void showBagDetails() {
		System.out.println("\nBag ID: " + id + ", Color: " + color);
		System.out.println("Capacity: " + capacity);
		System.out.println("Balls inside:");
		
		if(balls.isEmpty()) {
			System.out.println("No balls in this bag");
		} else {
			for (Ball ball : balls) {
				System.out.println(ball.getBallDetails());
			}
		}
	}
}
