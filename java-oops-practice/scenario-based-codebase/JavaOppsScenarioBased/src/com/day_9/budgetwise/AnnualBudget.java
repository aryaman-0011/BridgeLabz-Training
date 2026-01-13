package com.day_9.budgetwise;

import java.util.*;

public class AnnualBudget extends Budget {

	public AnnualBudget(double income, double limit, HashMap<String, Double> categoryLimits) {
		super(income, limit, categoryLimits);
	}

	@Override
	public void generateReport() {
		System.out.println("--------Annual Financial Summary--------");
		System.out.println("Yearly Income: " + income);
		System.out.println("Yearly Expenses: " + calculateTotalExpenses());
		System.out.println("Savings: " + calculateNetSavings());
	}

	@Override
	public void detectOverspend() {
		System.out.println("Annual Overspending review:");
		if(calculateTotalExpenses() > limit) {
			System.out.println("Total budget exceeded");
		} else {
			System.out.println("Spending within annual limits");
		}
	}
}
