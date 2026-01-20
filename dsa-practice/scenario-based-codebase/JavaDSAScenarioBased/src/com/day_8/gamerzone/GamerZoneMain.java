package com.day_8.gamerzone;


public class GamerZoneMain {

    public static void main(String[] args) {

        Player[] players = {
            new Player("Arya", 420),
            new Player("Ishu", 900),
            new Player("Harsh", 650),
            new Player("Hacker", 300),
            new Player("Altarain", 780)
        };

        System.out.println("Before Sorting:");
        print(players);

        QuickSort.quickSort(players, 0, players.length - 1);

        System.out.println("\nLive Leaderboard:");
        print(players);
    }

    private static void print(Player[] players) {
        for (Player p : players) {
            System.out.println(p);
        }
    }
}
