/*
 8. CropMonitor – Sensor Data Ordering (Quick Sort)
Story: An agri-tech firm uses drone sensors that record soil temperatures at random intervals.
The large data needs to be sorted quickly by timestamp before visualization. Quick Sort is
chosen due to its fast average performance.
Key Concepts:
● Unordered sensor data
● High-speed sorting
● Quick partitioning based on timestamps
*/

package com.day_5.cropmonitor;

public class CropMonitorMain {

	public static void main(String[] args) {
		
		SensorReading[] data = {
				new SensorReading(170540, 26.5),
				new SensorReading(170541, 24.1),
				new SensorReading(170542, 28.2),
				new SensorReading(170539, 23.8),
				new SensorReading(170540, 27.0)
		};
		
		System.out.println("Before Sorting:");
		printData(data);
		
		QuickSort.sort(data, 0, data.length - 1);
		
		System.out.println("\nAfter sorting (by timestamp):");
		printData(data);
	}
	
	static void printData(SensorReading[] data) {
		for(SensorReading s : data) {
			System.out.println("Timestamp: " + s.timeStamp + " | Temperature: " + s.temperature + "°C");
		}
	}
}
