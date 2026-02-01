package com.functionalinterface.consumer.orderconfirmation;

import java.util.function.Consumer;

public class ConfirmationMain {

    public static void main(String[] args) {

        Order o1 = new Order(5001, "Aman", 2499.99);
        Order o2 = new Order(5002, "Neha", 1599.50);

        Consumer<Order> confirmOrder = order -> {
            System.out.println("Order Confirmed!");
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Customer: " + order.getCustomerName());
            System.out.println("Amount Paid: ₹" + order.getAmount());
            System.out.println("Your order will be delivered soon.");
            System.out.println();
        };

        confirmOrder.accept(o1);
        confirmOrder.accept(o2);
    }
}
