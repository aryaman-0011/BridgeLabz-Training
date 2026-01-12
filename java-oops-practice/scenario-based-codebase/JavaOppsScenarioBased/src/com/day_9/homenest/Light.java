package com.day_9.homenest;

public class Light extends Device {
	
	public Light(String deviceId) {
		super(deviceId);
		this.energyUsage = 0.05;
	}
	
	@Override
	public void turnOn() {
		setStatus(true);
		System.out.println("Light " + deviceId + " turned ON");
	}
	
	@Override
	public void turnOff() {
		setStatus(false);
		System.out.println("Light " + deviceId + " turned OFF");
	}
	
	@Override
	public void reset() {
		System.out.println("Light reset: brightness set to default");
	}
}
