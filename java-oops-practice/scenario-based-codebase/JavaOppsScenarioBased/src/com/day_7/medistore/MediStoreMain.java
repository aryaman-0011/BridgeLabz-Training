package com.day_7.medistore;

public class MediStoreMain {
	
	public static void main (String[] args) {
		
		Medicine med1 = new Tablet("Paracetamol", 2.5, "12-9-2026", 50);
		Medicine med2 = new Syrup("Cought Syrup", 85, "12-11-2026", 20);
		
		med1.sell(5);
		med1.checkExpiry();
		
		med2.sell(2);
		med2.checkExpiry();
	}
}
