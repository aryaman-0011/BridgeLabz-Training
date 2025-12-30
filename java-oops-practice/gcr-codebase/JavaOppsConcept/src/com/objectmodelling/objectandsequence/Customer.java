package com.objectmodelling.objectandsequence;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Product> products;

    Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Composition: Customer creates Product
    void addProduct(String name, double quantity, double pricePerUnit) {
        products.add(new Product(name, quantity, pricePerUnit));
    }

    List<Product> getProducts() {
        return products;
    }

    String getName() {
        return name;
    }
}
