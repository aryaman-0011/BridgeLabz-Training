package com.day_9.gamebox;

public class ArcadeGame extends Game {
	
	public ArcadeGame(String title, double price) {
		super(title, "Arcade", price);
	}
	
	@Override
	public void download() {
		System.out.println(title + " arcade game downloaded!");
	}
	
	@Override
	public void playDemo() {
		System.out.println("Playing arcade game demo of: " + title);
	}
}
