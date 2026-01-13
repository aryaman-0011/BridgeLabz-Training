package com.day_9.budgetwise;

import java.util.*;

public abstract class Budget implements IAnalyzable {
	
	protected double income;
	protected double limit;
	protected Map<String, Double> categoryLimits;
	protected List<Transaction> transactions;
	
	
	protected Budget(double income, double limit, Map<String, Double> categoryLimits) {
		this.income = income;
		this.limit = limit;
		this.categoryLimits = categoryLimits;
		this.transactions = new ArrayList<Transaction>();
	}
	
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	
	protected double calculateTotalExpenses() {
		double total = 0;
		for(Transaction t : transactions) {
			if(t.getType().equals("EXPENSE")) {
				total += t.getAmount();
			}
		}
		return total;
	}
	
	public double calculateNetSavings() {
		return income - calculateTotalExpenses();
	}
}
