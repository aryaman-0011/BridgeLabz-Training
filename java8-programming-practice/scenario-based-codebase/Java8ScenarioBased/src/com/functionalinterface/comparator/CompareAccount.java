package com.functionalinterface.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Account {
	String name;
	double balance;
	
	Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
}


public class CompareAccount {

	public static void main(String[] args) {
		
		List<Account> list = Arrays.asList(
				new Account("Aryaman", 30000),
				new Account("Harsh", 25000),
				new Account("Akash", 15000)
		);
		
		Comparator<Account> byBalance = (b1, b2) -> Double.compare(b1.balance, b2.balance);
		
		list.sort(byBalance);
		list.forEach(b -> System.out.println(b.name + "Balance: " + b.balance));
	}
}
