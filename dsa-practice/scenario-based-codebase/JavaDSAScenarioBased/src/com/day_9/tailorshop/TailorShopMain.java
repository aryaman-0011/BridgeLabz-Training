package com.day_9.tailorshop;


public class TailorShopMain {

    public static void main(String[] args) {

        Order[] orders = {
            new Order(101, "Amit", "2026-01-15"),
            new Order(102, "Riya", "2026-01-10"),
            new Order(103, "Karan", "2026-01-20"),
            new Order(104, "Neha", "2026-01-12")
        };

        System.out.println("Before Sorting:");
        printOrders(orders);
        

        InsertionSort.sortByDeliveryDate(orders);

        System.out.println("\nAfter Sorting by Delivery Deadline:");
        printOrders(orders);
    }

    private static void printOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
