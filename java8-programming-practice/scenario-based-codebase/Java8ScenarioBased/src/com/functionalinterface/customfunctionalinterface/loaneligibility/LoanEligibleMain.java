package com.functionalinterface.customfunctionalinterface.loaneligibility;

public class LoanEligibleMain {

	public static void main(String[] args) {
		
		EligibleLoan el = (income, score) -> income > 30000 && score >= 700;
		
		System.out.println("Loan Eligible: " + el.loanEligibility(25000, 700));
	}
}
