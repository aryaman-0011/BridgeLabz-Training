package com.day_11.gamingapp;

public class Player {
    int id;
    String name;
    int score;

    public Player(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " (ID:" + id + ", Score:" + score + ")";
    }
}
