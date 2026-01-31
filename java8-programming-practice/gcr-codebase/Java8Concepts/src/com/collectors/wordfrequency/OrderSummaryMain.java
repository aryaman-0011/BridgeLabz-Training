package com.collectors.wordfrequency;

import java.util.*;
import java.util.stream.Collectors;

public class OrderSummaryMain {

    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order("Aryaman", 2500),
                new Order("Riya", 1800),
                new Order("Aryaman", 3200),
                new Order("Kabir", 1500),
                new Order("Riya", 2200)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,
                        Collectors.summingDouble(Order::getAmount)
                ));

        revenueByCustomer.forEach((customer, total) ->
                System.out.println(customer + " → Total Revenue: ₹" + total));
    }
}
