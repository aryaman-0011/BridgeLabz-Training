package com.day_3.parceltracker;

public class ParcelTracker {
	
	Stage head;
	
	public void addStage(String name) {
		Stage newStage = new Stage(name);
		
		if(head == null) {
			head = newStage;
			return;
		}
		
		Stage temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newStage;		
	}
	
	public void addCheckpoint(String after, String checkpoint) {
		Stage temp = head;
		
		while(temp != null) {
			if(temp.name.equals(after)) {
				Stage newStage = new Stage(checkpoint);
				newStage.next = temp.next;
				temp.next = newStage;
				return;
			}
			
			temp = temp.next;
		}
		
		System.out.println("Stage not found: " + after);
	}
	
    // Track parcel forward
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost (no tracking data)");
            return;
        }

        Stage temp = head;
        System.out.print("Parcel Journey: ");

        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }
}
