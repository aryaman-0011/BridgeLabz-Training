package com.functionalinterface.supplier;

import java.util.UUID;
import java.util.function.Supplier;

public class DiscountCoupon {

	public static void main(String[] args) {
		
		Supplier<String> coupon = () -> "DISC" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
		
		System.out.println("Generated coupon: " + coupon.get());
	}
}
