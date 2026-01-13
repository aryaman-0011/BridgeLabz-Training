package com.day_3.smartcheckout;

import java.util.*;

public class SmartCheckoutMain {

	public static void main(String[] args) {
		
		SmartCheckout checkout = new SmartCheckout();
		
		// Initialize prices
		checkout.priceMap.put("Milk", 50);
		checkout.priceMap.put("Bread", 40);
		checkout.priceMap.put("Eggs", 10);
		
		// initialize Stock
		checkout.stockMap.put("Milk", 5);
		checkout.stockMap.put("Bread", 3);
		checkout.stockMap.put("Eggs", 10);
		
		Customer customer1 = new Customer("Aman", Arrays.asList("Milk", "Eggs"));
		Customer customer2 = new Customer("Neha", Arrays.asList("Bread", "Milk"));
		
		checkout.addCustomer(customer1);
		checkout.addCustomer(customer2);
		
		checkout.processCustomer();
		checkout.processCustomer();
		
		checkout.showStock();
	}
}
