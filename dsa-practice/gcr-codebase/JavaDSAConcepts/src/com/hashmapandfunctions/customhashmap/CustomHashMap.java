package com.hashmapandfunctions.customhashmap;

import java.util.LinkedList;

public class CustomHashMap {

    // Node class
    private static class Node {
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private LinkedList<Node>[] buckets;

    // Constructor
    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hash(int key) {
        return key % capacity;
    }

    // Put operation
    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Node> bucket = buckets[index];

        for (Node node : bucket) {
            if (node.key == key) {
                node.value = value; // update
                return;
            }
        }

        bucket.add(new Node(key, value));
    }

    // Get operation
    public Integer get(int key) {
        int index = hash(key);
        LinkedList<Node> bucket = buckets[index];

        for (Node node : bucket) {
            if (node.key == key) {
                return node.value;
            }
        }

        return null; // not found
    }

    // Remove operation
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Node> bucket = buckets[index];

        for (Node node : bucket) {
            if (node.key == key) {
                bucket.remove(node);
                return;
            }
        }
    }
}
