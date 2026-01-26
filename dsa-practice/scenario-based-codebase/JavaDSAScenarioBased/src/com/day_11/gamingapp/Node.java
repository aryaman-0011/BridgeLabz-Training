package com.day_11.gamingapp;

import java.util.*;

public class Node {
    int score;                     // key
    List<Player> players;          // players with same score
    int height;
    Node left, right;

    public Node(int score, Player p) {
        this.score = score;
        this.players = new ArrayList<>();
        this.players.add(p);
        this.height = 1;
    }
}
