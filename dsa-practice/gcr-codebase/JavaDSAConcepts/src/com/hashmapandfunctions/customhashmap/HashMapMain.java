package com.hashmapandfunctions.customhashmap;

public class HashMapMain {

    public static void main(String[] args) {

        CustomHashMap map = new CustomHashMap(5);

        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(8, 80); // collision with key 3 (3 % 5 == 8 % 5)

        System.out.println("Value for key 1: " + map.get(1));
        System.out.println("Value for key 2: " + map.get(2));
        System.out.println("Value for key 3: " + map.get(3));
        System.out.println("Value for key 8: " + map.get(8));

        map.remove(2);
        System.out.println("Value for key 2 after removal: " + map.get(2));
    }
}
