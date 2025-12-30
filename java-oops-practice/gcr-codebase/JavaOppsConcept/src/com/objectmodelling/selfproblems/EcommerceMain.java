package com.objectmodelling.selfproblems;

public class EcommerceMain{
    public static void main(String[] args) {

        Product laptop = new Product(1, "Laptop", 55000);
        Product mouse = new Product(2, "Mouse", 700);
        Product keyboard = new Product(3, "Keyboard", 1200);

        Customer customer = new Customer(101, "Aryaman");

        Order order1 = customer.placeOrder(5001);
        order1.addProduct(laptop);
        order1.addProduct(mouse);

        Order order2 = customer.placeOrder(5002);
        order2.addProduct(keyboard);

        customer.showOrders();
    }
}
