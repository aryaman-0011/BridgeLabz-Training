package com.day_2.traincompanion;

public class Train {
	
	Compartment head;
	
	// Add compartment at end
	public void addCompartment(String name) {
		Compartment newCompartment = new Compartment(name);
		
		if(head == null) {
			head = newCompartment;
			return;
		}
		
		Compartment temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newCompartment;
		newCompartment.prev = temp;
	}
	
	// Remove compartment
	public void removeCompartment(String name) {
		
		Compartment temp = head;
		
		while(temp != null) {
			if(temp.name.equals(name)) {
				if(temp.prev != null) {
					temp.prev.next = temp.next;
				} else {
					head = temp.next;
				}
				
				if(temp.next != null) {
					temp.next.prev = temp.prev;
				}
				
				System.out.println(name + " compartment removed");
				return;
			}
			
			temp = temp.next;
		}
	}
	
	// Move forward
	public void moveForward(Compartment current) {
		if (current.next != null) {
			System.out.println("Moved to: " + current.next.name);
		} else {
			System.out.println("you are at the last compartment!");
		}
	}
	
	// Move backward
	public void moveBackward(Compartment current) {
		if (current.prev != null) {
			System.out.println("Moved to: " + current.prev.name);
		} else {
			System.out.println("you are at the first compartment");
		}
	}
	
	// Show adjacent compartments
	public void showAjacebt(Compartment current) {
		System.out.println("\nCurrent" + current.name);
		System.out.println("Previous: " + (current.prev != null ? current.prev.name : "None"));
		System.out.println("Next: " + (current.next != null ? current.next.name : "None"));
		
	}
	
	// Display compartments
	public void displayTrain() {
		Compartment temp = head;
		
		System.out.println("Train: ");
		while(temp != null) {
			System.out.print(temp.name + " <-> ");
			temp = temp.next;
		}
		System.out.println("Null");
	}	
}
