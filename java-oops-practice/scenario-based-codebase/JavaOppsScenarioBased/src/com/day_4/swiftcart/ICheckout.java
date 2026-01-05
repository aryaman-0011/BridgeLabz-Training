package com.day_4.swiftcart;

public interface ICheckout {
	double applyDiscount(double totalPrice);
	void generateBill();
}
