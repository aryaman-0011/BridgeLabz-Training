package com.functionalinterface.supplier;

import java.util.function.Supplier;

public class RandomStuID {
	
	public static void main(String[] args) {
		
		Supplier<String> randomID = () -> "STU" + (int)(Math.random() * 10000) ;
		
		System.out.println("Generated Student ID: " + randomID.get());
	}

}
