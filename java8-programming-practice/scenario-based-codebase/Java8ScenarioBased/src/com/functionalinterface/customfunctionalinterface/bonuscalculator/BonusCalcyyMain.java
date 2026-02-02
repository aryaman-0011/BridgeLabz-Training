package com.functionalinterface.customfunctionalinterface.bonuscalculator;

public class BonusCalcyyMain {

	public static void main(String[] args) {
		
		BonusCalculator bc = salary -> salary * 0.10;
		
		System.out.println("Bonus: " + bc.calculateBonus(40000));
	}
}
