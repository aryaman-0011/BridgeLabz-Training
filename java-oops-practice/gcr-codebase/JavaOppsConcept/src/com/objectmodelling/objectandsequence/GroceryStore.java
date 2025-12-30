package com.objectmodelling.objectandsequence;

public class GroceryStore{
    public static void main(String[] args) {

        // Object Diagram
        Customer customer = new Customer("Ayush");

        customer.addProduct("Apples", 2, 3); // 2 kg @ $3
        customer.addProduct("Milk", 1, 2);   // 1 liter @ $2

        // Sequence Diagram flow
        BillGenerator billGenerator = new BillGenerator();
        double totalBill = billGenerator.generateBill(customer);

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Total Bill (in Rs): " + totalBill);
    }
}
