package com.day_3.eventtracker;

public class AuditLog {
    String eventName;
    String className;
    String methodName;
    String timestamp;

    public AuditLog(String eventName, String className, String methodName, String timestamp) {
        this.eventName = eventName;
        this.className = className;
        this.methodName = methodName;
        this.timestamp = timestamp;
    }
}
