package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private int customerId;
    private String name;
    private List<Order> orders;

    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    Order placeOrder(int orderId) {
        Order order = new Order(orderId);
        orders.add(order);
        return order;
    }

    void showOrders() {
        System.out.println("Customer: " + name);
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}
