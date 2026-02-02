package com.functionalinterface.supplier;

import java.util.function.Supplier;

public class DefaultWelcomeMessage {

	public static void main(String[] args) {
		
		Supplier<String> defaultMessage = () -> "Welcome to my system!";
		
		System.out.println(defaultMessage.get());
	}
}
