package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

class Order {
    private int orderId;
    private List<Product> products;

    Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;

        for (Product p : products) {
            System.out.println("- " + p.getName() + " : ₹" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total Amount: ₹" + total);
    }
}
