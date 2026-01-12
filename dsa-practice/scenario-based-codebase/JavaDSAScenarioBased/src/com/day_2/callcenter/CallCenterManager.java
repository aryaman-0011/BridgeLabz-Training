package com.day_2.callcenter;

import java.util.*;

public class CallCenterManager {
	
	Queue<String> normalQueue = new LinkedList<>();
	PriorityQueue<String> vipQueue = new PriorityQueue<>();
	HashMap<String, Integer> callCountMap = new HashMap<>();
	
	
	// Receive incoming call
	public void recieveCall(String name, boolean isVIP) {
		callCountMap.put(name, callCountMap.getOrDefault(name, 0) + 1);
		
		if(isVIP) {
			vipQueue.add(name);
			System.out.println("VIP call recieved: " + name);
		} else {
			normalQueue.add(name);
			System.out.println("Normal call received: " + name);
		}
	}
	
	// Handle next call
	public void handleCall() {
		if(!vipQueue.isEmpty()) {
			System.out.println("Handling VIP customer: " + vipQueue.poll());
		} else if (!normalQueue.isEmpty()) {
			System.out.println("Handling normal customer: " + normalQueue.poll());
		} else {
			System.out.println("No calls waiting");
		}
	}
	
	// Show call statistics
	public void showCallStatistics() {
		System.out.println("\nCustomer Call Count:");
		for (String name : callCountMap.keySet()) {
			System.out.println(name + " -> " + callCountMap.get(name) + " calls");
		}
	}
	
	
}
