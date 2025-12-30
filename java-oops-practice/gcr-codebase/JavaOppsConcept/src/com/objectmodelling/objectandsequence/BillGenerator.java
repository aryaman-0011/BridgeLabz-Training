package com.objectmodelling.objectandsequence;

class BillGenerator {

    double generateBill(Customer customer) {
        double total = 0;

        for (Product p : customer.getProducts()) {
            total += p.getTotalPrice();
        }
        return total;
    }
}
