package com.functionalinterface.supplier;

import java.util.function.Supplier;

public class GenerateOTP {

	public static void main(String[] args) {
		
		Supplier<Integer> genOTP = () -> (int)(Math.random() * 9000) + 1000;
		
		System.out.println("Generated OTP: " + genOTP.get());
	}
}
