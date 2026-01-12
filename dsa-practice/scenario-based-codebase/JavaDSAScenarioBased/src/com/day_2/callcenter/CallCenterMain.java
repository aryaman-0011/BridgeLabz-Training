/*
4. CallCenter – Customer Queue Manager (Queue + HashMap)
Story: In a telecom call center, customers are queued based on the time of call. Priority
customers have a special queue. A HashMap keeps track of the number of times each user has
called this month.
Requirements:

● Use Queue for managing incoming calls.
● Use HashMap for customer data.
● Priority Queue for VIP customers.
*/


package com.day_2.callcenter;

public class CallCenterMain {
	
	public static void main (String[] args) {
		
		CallCenterManager manager = new CallCenterManager();
		
		manager.recieveCall("Aryaman", false);
		manager.recieveCall("Modi", true);
		manager.recieveCall("Vishal", true);
		manager.recieveCall("Ansh", false);
		manager.recieveCall("Aryaman", false);

		
		System.out.println("\nHandling calls");
		
		manager.handleCall();
		manager.handleCall();
		manager.handleCall();
		manager.handleCall();
		
		manager.showCallStatistics();
	}
}
