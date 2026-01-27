package com.day_3.healthcheckpro;

public class HealthCheckProMain {
	
    public static void main(String[] args) {
        // HealthCheckPro scans the controller
        HealthCheckPro.scanController(Controller.class);
    }
}
