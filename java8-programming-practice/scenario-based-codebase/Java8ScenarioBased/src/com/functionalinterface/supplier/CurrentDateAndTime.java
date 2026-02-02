package com.functionalinterface.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class CurrentDateAndTime {
	
	public static void main(String[] args) {
		
		Supplier<LocalDateTime> dateTime = LocalDateTime::now;
		
		System.out.println("Current Date and Time: " + dateTime.get());
	}

}
