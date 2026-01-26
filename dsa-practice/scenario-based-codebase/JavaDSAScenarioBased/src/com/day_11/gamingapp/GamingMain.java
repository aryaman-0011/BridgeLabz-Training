package com.day_11.gamingapp;

public class GamingMain {
    public static void main(String[] args) {

        Leaderboard lb = new Leaderboard();

        lb.addPlayer(new Player(1, "Aryan", 1200));
        lb.addPlayer(new Player(2, "Zara", 1500));
        lb.addPlayer(new Player(3, "Kabir", 1800));
        lb.addPlayer(new Player(4, "Riya", 1700));
        lb.addPlayer(new Player(5, "Dev", 1500));

        lb.displayTopPlayers(10);

        System.out.println("\n❌ Removing score 1500...");
        lb.removeScore(1500);

        lb.displayTopPlayers(10);
    }
}
