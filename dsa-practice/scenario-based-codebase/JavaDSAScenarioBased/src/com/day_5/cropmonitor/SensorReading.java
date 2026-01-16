package com.day_5.cropmonitor;

public class SensorReading {

	long timeStamp;
	double temperature;
	
	public SensorReading(long timeStamp, double temperature) {
		this.timeStamp = timeStamp;
		this.temperature = temperature;
	}
}
