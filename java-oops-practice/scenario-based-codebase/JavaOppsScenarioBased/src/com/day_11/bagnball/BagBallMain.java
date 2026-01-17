package com.day_11.bagnball;

public class BagBallMain {
	
	public static void main(String[] args) {
		Bag bag1 = new Bag(101, "Red", 2);
		Bag bag2 = new Bag(102, "Blue", 3);
		
		Ball b1 = new Ball(1, "Yellow", "Small");
		Ball b2 = new Ball(2, "Green", "Medium");
		Ball b3 = new Ball(3, "Blue", "Large");
		
		bag1.addBall(b1);
		bag1.addBall(b2);
		bag1.addBall(b3);
		
		bag2.addBall(b3);
		
		bag1.showBagDetails();
		bag2.showBagDetails();
	}
	
}
