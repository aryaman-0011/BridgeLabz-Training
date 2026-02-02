package com.functionalinterface.runnable;

public class SeperateThreadMessage {

	public static void main(String[] args) {
		
		Runnable manageTask = () -> {
			System.out.println("Hi from seperate thread");
		};
		
		Thread t = new Thread(manageTask);
		t.start();
	}
}
