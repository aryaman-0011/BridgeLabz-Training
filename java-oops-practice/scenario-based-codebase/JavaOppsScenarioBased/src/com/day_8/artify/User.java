package com.day_8.artify;

public class User {
	


	private String name;
	private double walletBalance;
	
	public User(String name, double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	}
	
	public boolean deductBalance(double amount) {
		
		if (walletBalance < amount) {
			System.out.println("Insufficent wallet balance");
			return false;
		}
		
		walletBalance = walletBalance - amount;
		return true;
	}
	
	@Override
	public String toString() {
		return name;
	}

	
	public double getWalletBalance() {
		return walletBalance;
	}
}
