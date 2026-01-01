package com.day_1.loan;

public class LoanMain {
	public static void main (String[] args) {
		Loan loan = new Loan(500000, 10, 60);
		
		EMICalculator calculator = new EMICalculator();
		double emi = calculator.calculateEMI(loan);
		
		PrintLoan printer = new PrintLoan();
		printer.printDetails(loan, emi);
	}
}
