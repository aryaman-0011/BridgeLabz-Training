package com.day_3.eventtracker;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;

public class EventTracker {

    public static void scanAndLog(Class<?> clazz, String outputFile) {
        List<AuditLog> logs = new ArrayList<>();

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(AuditTrail.class)) {
                AuditTrail audit = method.getAnnotation(AuditTrail.class);

                String timestamp = LocalDateTime.now().toString();

                AuditLog log = new AuditLog(
                        audit.eventName(),
                        clazz.getSimpleName(),
                        method.getName(),
                        timestamp
                );

                logs.add(log);
            }
        }

        // Convert logs to JSON
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer = new FileWriter(outputFile);
            gson.toJson(logs, writer);
            writer.close();

            System.out.println("✅ Audit JSON log generated!");
        } catch (Exception e) {
            System.out.println("Error writing JSON: " + e.getMessage());
        }
    }
}
