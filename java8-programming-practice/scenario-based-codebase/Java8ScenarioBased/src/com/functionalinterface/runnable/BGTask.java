package com.functionalinterface.runnable;

public class BGTask {

	public static void main(String[] args) {
		
		Runnable  bgJob = () -> {
			for(int i = 0; i <= 5; i++) {
				System.out.println("Helloooo...... " + i);
				try { Thread.sleep(1000);} catch(InterruptedException e) {};
			}
			
			System.out.println("Bg task finished");
		};
		
		new Thread(bgJob).start();
		System.out.println("Mainthread continues....");
	}
}
