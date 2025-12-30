package com.objectmodelling.selfproblems;

class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    String getName() {
        return name;
    }
}
