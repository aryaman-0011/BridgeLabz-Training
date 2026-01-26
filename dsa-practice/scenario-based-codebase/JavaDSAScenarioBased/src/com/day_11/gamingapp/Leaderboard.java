package com.day_11.gamingapp;

import java.util.*;

public class Leaderboard {

    private Node root;

    // Utility 
    private int height(Node n) {
        return n == null ? 0 : n.height;
    }

    private int getBalance(Node n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }


    // Insert / Update Player


    public void addPlayer(Player p) {
        root = insert(root, p);
    }

    private Node insert(Node node, Player p) {
        if (node == null)
            return new Node(p.score, p);

        if (p.score < node.score)
            node.left = insert(node.left, p);
        else if (p.score > node.score)
            node.right = insert(node.right, p);
        else { // same score
            node.players.add(p);
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // AVL balancing
        if (balance > 1 && p.score < node.left.score)
            return rightRotate(node);
        if (balance < -1 && p.score > node.right.score)
            return leftRotate(node);
        if (balance > 1 && p.score > node.left.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && p.score < node.right.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }


    // Scenario 2: Display Top 10 Players


    public void displayTopPlayers(int k) {
        List<Player> result = new ArrayList<>();
        reverseInorder(root, result, k);

        System.out.println("🏆 Top Players:");
        for (Player p : result)
            System.out.println(p);
    }

    private void reverseInorder(Node node, List<Player> res, int k) {
        if (node == null || res.size() >= k)
            return;

        reverseInorder(node.right, res, k); // higher scores first

        for (Player p : node.players) {
            if (res.size() < k)
                res.add(p);
        }

        reverseInorder(node.left, res, k);
    }


    // Scenario 3: Remove Player (by score)


    public void removeScore(int score) {
        root = delete(root, score);
    }

    private Node delete(Node node, int score) {
        if (node == null) return null;

        if (score < node.score)
            node.left = delete(node.left, score);
        else if (score > node.score)
            node.right = delete(node.right, score);
        else {
            if (node.left == null || node.right == null) {
                node = (node.left != null) ? node.left : node.right;
            } else {
                Node temp = minValueNode(node.right);
                node.score = temp.score;
                node.players = temp.players;
                node.right = delete(node.right, temp.score);
            }
        }

        if (node == null) return null;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        if (balance > 1 && getBalance(node.left) >= 0)
            return rightRotate(node);
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && getBalance(node.right) <= 0)
            return leftRotate(node);
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private Node minValueNode(Node node) {
        while (node.left != null)
            node = node.left;
        return node;
    }
}
