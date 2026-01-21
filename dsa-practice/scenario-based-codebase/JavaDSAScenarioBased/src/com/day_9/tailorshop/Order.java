package com.day_9.tailorshop;

public class Order {

	int orderId;
	String customerName;
	String deliveryDate;
	
	public Order(int orderId, String curstomerName, String deliveryDate) {
		this.orderId = orderId;
		this.customerName = curstomerName;
		this.deliveryDate = deliveryDate;
	}
	
	public String getDeliveryDate() {
		return  deliveryDate;
	}
	
	@Override
	public String toString() {
		return orderId + " : " + customerName + " - " + deliveryDate;
	}
}
