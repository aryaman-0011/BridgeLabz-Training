package com.day_9.tailorshop;

public class InsertionSort {

    public static void sortByDeliveryDate(Order[] orders) {

        for (int i = 1; i < orders.length; i++) {

            Order key = orders[i];
            int j = i - 1;

            // Shift orders with later deadlines to the right
            while (j >= 0 &&
                   orders[j].getDeliveryDate()
                       .compareTo(key.getDeliveryDate()) > 0) {

                orders[j + 1] = orders[j];
                j--;
            }

            // Insert the new order at correct position
            orders[j + 1] = key;
        }
    }
}
