package com.day_9.gamebox;

public class GameBoxMain {

	public static void main(String[] args) {
		
		Game game1 = new ArcadeGame("Tekken", 1500);
		Game game2 = new StrategyGame("Clash Of Clans", 200);
		
		game1.applySeasonalOffer(20);
		
		User user = new User("Aryaman");
		
		game1.playDemo();
		game2.playDemo();
		
		game1.download();
		
		
		user.buyGame(game1);
		user.buyGame(game2);
		
		user.showLibrary();
	}
}
