package com.day_9.budgetwise;

import java.util.*;

public class MonthlyBudget extends Budget {
	
	public MonthlyBudget(double income, double limit, HashMap<String, Double> categoryLimits) {
		super(income, limit, categoryLimits);
	}
	
	@Override
	public void generateReport() {
		System.out.println("---------Monthly Budget Report---------");
		System.out.println("Income: " + income);
		System.out.println("Expenses: " + calculateTotalExpenses());
		System.out.println("Savings: " + calculateNetSavings());
	}
	
	@Override
	public void detectOverspend() {
		System.out.println("Overspending Check (Monthly): ");
		for(String category : categoryLimits.keySet()) {
			double spent = 0;
			for(Transaction t : transactions) {
				if(t.getCategory().equals(category)) {
					spent += t.getAmount();
				}
			}
			
			if(spent > categoryLimits.get(category)) {
				System.out.println(category + " exceeded by " + (spent - categoryLimits.get(category)));
			}
		}
	}
	
}
