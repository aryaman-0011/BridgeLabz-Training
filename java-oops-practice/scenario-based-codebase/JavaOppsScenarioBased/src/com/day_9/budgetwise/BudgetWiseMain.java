package com.day_9.budgetwise;

import java.util.*;

public class BudgetWiseMain {

	public static void main(String[] args) {
		
		HashMap<String, Double> categories = new HashMap<>();
		
		categories.put("Food", 5000.00);
		categories.put("Travel", 3000.00);
		
		Budget budget = new MonthlyBudget(20000, 15000, categories);
		
		budget.addTransaction(new Transaction(3000, "EXPENSE", "Food"));
		budget.addTransaction(new Transaction(4000, "EXPENSE", "Travel"));
		budget.addTransaction(new Transaction(2000, "EXPENSE", "Food"));
		
		budget.generateReport();
		budget.detectOverspend();
	}
}
