package com.objectmodelling.objectandsequence;

class Product {
    private String name;
    private double quantity;
    private double pricePerUnit;

    Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    String getName() {
        return name;
    }
}
