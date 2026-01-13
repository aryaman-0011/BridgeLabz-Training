package com.day_3.smartcheckout;

import java.util.*;

public class SmartCheckout {

	Queue<Customer> customerQueue = new LinkedList<>();
	
	HashMap<String, Integer> priceMap = new HashMap<>();
	HashMap<String, Integer> stockMap = new HashMap<>();
	
	public void addCustomer(Customer customer) {
		customerQueue.add(customer);
		System.out.println(customer.name + " joined tha checkout queue.");
	}
	
	public void processCustomer() {
		if(customerQueue.isEmpty()) {
			System.out.println("No customers in queue");
			return;
		}
		
		Customer customer = customerQueue.poll();
		int totalBill = 0;
		
		System.out.println("\nBilling: " + customer.name);
		
		for(String item : customer.items) {
			if(stockMap.get(item) > 0) {
				totalBill += priceMap.get(item);
				stockMap.put(item, stockMap.get(item) - 1);
			} else {
				System.out.println(item + " is out of stock!");
			}
		}
		
		System.out.println("Total Bill: " + totalBill);
	}
	
	public void showStock() {
		System.out.println("\nCurrent Stock:");
		for(String item : stockMap.keySet()) {
			System.out.println(item + " -> " + stockMap.get(item));
		}
	}
}
