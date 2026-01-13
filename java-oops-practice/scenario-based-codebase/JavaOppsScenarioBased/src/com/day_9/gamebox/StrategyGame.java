package com.day_9.gamebox;

public class StrategyGame extends Game {

	public StrategyGame(String title, double price) {
		super(title, "Strategy", price);
	}
	
	@Override
	public void download() {
		System.out.println(title + " strategy game downloaded!");
	}
	
	@Override
	public void playDemo() {
		System.out.println("Playing strategy game demo of: " + title);
	}
}
