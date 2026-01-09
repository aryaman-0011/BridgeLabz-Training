package com.day_8.artify;

public class ArtifyMain {

	public static void main (String[] args) {
		
		User buyer1 = new User("Aarav", 5000);
		
		ArtWork art1 = new DigitalArt("Venom", "Harsh", 2000, "Online", true);
		
		ArtWork art2 = new PrintArt("Cat", "Muskan", 1500, "Personal");
		
		art1.showDetails();
		art1.purchase(buyer1);
		art1.license();
		
		System.out.println("Wallet Balance: " + buyer1.getWalletBalance());
		
		System.out.println();
		
		art2.showDetails();
		art2.purchase(buyer1);
		art2.license();
		
		System.out.println("Wallet Balance: " + buyer1.getWalletBalance());
	}
}
