package com.day_9.homenest;

public abstract class Device implements IControllable {
	
	protected String deviceId;
	private boolean status;
	protected double energyUsage;
	
	protected Device(String deviceId) {
		this.deviceId = deviceId;
		this.status = false;
		this.energyUsage = 0.0;
	}
	
	protected void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public double getEnergyUsage() {
		return energyUsage;
	}
	
	protected void logFirmwareUpdate(String message) {
		System.out.println("[FIRMWARE LOG] " + message);
	}
	
	protected double calculateMonthlyUsage(int hoursPerDay) {
		return energyUsage * hoursPerDay * 30;
	}
}
