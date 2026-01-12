/*
5. TrainCompanion – Compartment Navigation System (Doubly Linked
List)
Story: In a long-distance train app, passengers can walk to the next or previous compartment,
or search for services (like pantry, WiFi). Each compartment is a node in a Doubly Linked List.
Requirements:
● Traverse forward or backward.
● Insert/Remove compartments dynamically.
● Display adjacent compartments for quick decisions.
*/

package com.day_2.traincompanion;

public class TrainMain {
	public static void main(String[] args) {
		
		Train train = new Train();
		
		train.addCompartment("Engine");
		train.addCompartment("Pantry");
		train.addCompartment("Sleeper");
		train.addCompartment("AC");
		train.addCompartment("Control Room");
		
		train.displayTrain();
		
		Compartment current = train.head.next.next;
		
		train.showAjacebt(current);
		
		train.moveForward(current);
		train.moveBackward(current);
		
		train.removeCompartment("AC");
		
		train.displayTrain();
		
	}
}
