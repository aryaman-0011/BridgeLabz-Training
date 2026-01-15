/*
4. EventManager – Ticket Price Optimizer (Quick Sort)
Story: An event booking portal sorts millions of tickets by price before showing the top 50
cheapest or most expensive. Since speed is crucial and data is unsorted, Quick Sort is used for
its average-case performance.
Key Concepts:
● Fast average time
● Recursive partitioning
● Ideal for large, random datasets
*/

package com.day_4.eventmanager;

import java.util.Arrays;

public class EventManagerMain {

    public static void main(String[] args) {

        int[] ticketPrices = {
            4500, 1200, 3000, 800, 9999, 2500, 1800
        };

        QuickSort.quickSort(ticketPrices, 0, ticketPrices.length - 1);

        System.out.println("Sorted Ticket Prices:");
        System.out.println(Arrays.toString(ticketPrices));

        // Top 3 cheapest
        System.out.println("Top 3 Cheapest Tickets:");
        for (int i = 0; i < 3; i++) {
            System.out.println(ticketPrices[i]);
        }

        // Top 3 expensive
        System.out.println("Top 3 Expensive Tickets:");
        for (int i = ticketPrices.length - 1; i >= ticketPrices.length - 3; i--) {
            System.out.println(ticketPrices[i]);
        }
    }
}
