package com.day_9.gamebox;

import java.util.*;

public class User {
	
	private String username;
	private List<Game> ownedGame;
	
	public User(String username) {
		this.username = username;
		this.ownedGame = new ArrayList<>();
	}
	
	public void buyGame(Game game) {
		ownedGame.add(game);
		System.out.println(username + " purchased " + game.getTitle());
	}
	
	public void showLibrary() {
		System.out.println("Games owned by " + username + ": ");
		for(Game game : ownedGame) {
			System.out.println("- " + game.getTitle());
		}
	}
}
