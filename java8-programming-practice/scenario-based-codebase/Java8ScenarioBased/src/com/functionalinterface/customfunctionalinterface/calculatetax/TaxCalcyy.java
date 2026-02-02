package com.functionalinterface.customfunctionalinterface.calculatetax;

public class TaxCalcyy {

	public static void main(String[] args) {
		
		CalculateTax ct = income -> income * 0.18;
		
		System.out.println("Calculated tax: " + ct.calculateTax(100000));
	}
}
