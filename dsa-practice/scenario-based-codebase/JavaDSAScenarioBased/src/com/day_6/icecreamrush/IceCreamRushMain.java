/*
 2. SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: A digital kiosk in a library maintains a list of books a user has borrowed. Every time a
new book is issued, the system adds it to the user's list while keeping it alphabetically sorted
by title. Since insertions are done one at a time, and the list is usually already sorted, Insertion
Sort is the perfect fit.

Concepts Involved:
● Insertion Sort
● Dynamic list insertion
● Nearly sorted data
*/


package com.day_6.icecreamrush;

public class IceCreamRushMain {

	public static void main(String[] args) {
		
		Flavour[] flavours = {
				new Flavour("Vanilla", 100),
				new Flavour("Chocolate", 150),
				new Flavour("Mango", 80),
				new Flavour("Butterscotch", 50),
				new Flavour("Black Current", 20),
				new Flavour("Coffee", 30)
				
		};
		
		System.out.println("Before Sorting:");
		for(Flavour f : flavours) {
			System.out.println(f);
		}
		
		BubbleSort.bubbleSort(flavours);
		
		System.out.println("\nAfter Sorting (by sold count):");
		for(Flavour f : flavours) {
			System.out.println(f);
		}
	}
}
