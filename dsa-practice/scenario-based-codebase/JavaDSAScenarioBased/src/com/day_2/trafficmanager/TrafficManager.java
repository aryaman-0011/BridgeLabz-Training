package com.day_2.trafficmanager;

import java.util.*;

public class TrafficManager {

	private Vehicle head = null;
	private Vehicle tail = null;
	
	Queue<String> waitingQueue = new LinkedList<>();
	
	private int maxCapacity = 5;
	
	// Vehicle enters waiting queue
	public void arriveAtSignal(String vehicleNumber) {
		if(waitingQueue.size() >= maxCapacity) {
			System.out.println("Queue Overflow! Vehicle " + vehicleNumber + " must wait.");
			return;
		}
		waitingQueue.add(vehicleNumber);
		System.out.println("Vehicle " + vehicleNumber + " added to waiting queue!");
	}
	
	
	// Move vehicle from queue to roundabout
	public void enterRoundabout() {
		if(waitingQueue.isEmpty()) {
			System.out.println("Queue Underflow! No vehicle waiting.");
			return;
		}
		
		Vehicle newVehicle = new Vehicle(waitingQueue.poll());
		
		if(head == null) {
			head = tail = newVehicle;
			newVehicle.next = head;
		} else {
			tail.next = newVehicle;
			tail = newVehicle;
			tail.next = head;
		}
		
		System.out.println("Vehicle " + newVehicle.number + " enetered roundabout.");
	}
	
	// Remove vehicle from roundabout
	public void exitRoundabout(String vehicleNumber) {
		
		if(head == null) {
			System.out.println("Roundabout is empty!");
			return;
		}
		
		Vehicle current = head;
		Vehicle previous = tail;
		
		do {
			if(current.number.equals(vehicleNumber)) {
				if(current == head) {
					head = head.next;
					tail.next = head;
				} else if (current == tail) {
					tail = previous;
					tail.next = head;
				} else {
					previous.next = current.next;
				}
				
				System.out.println("Vehicle " + vehicleNumber + " exited roundabout.");
				return;
			}
			
			previous = current;
			current = current.next;
		} while (current != head);		
	}
	
	// Display roundabout state
	public void displayRoundabout() {
		if(head == null) {
			System.out.println("Roundabout is empty");
		}
		
		Vehicle temp = head;
		System.out.println("Roundabout: ");
		
		do {
			System.out.print(temp.number + " -> ");
			temp = temp.next;
		} while (temp != head);
		
		System.out.println("(back to start)");
		
	}
}
