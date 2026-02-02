package com.optionalclass.scenario5;

public class Main {

    public static void main(String[] args) {

        ConfigService configService = new ConfigService();

        // Read config value
        System.out.println("App Name: " +
                configService.getConfig("app.name").orElse("Unknown App"));

        // Environment variable
        System.out.println("JAVA_HOME: " +
                configService.getEnv("JAVA_HOME").orElse("Not Set"));

        // Default file path if config missing
        System.out.println("File Path: " +
                configService.getConfig("file.path").orElse("/default/path"));

        // Handle API response safely
        ApiResponse response = new ApiResponse(null);
        System.out.println("API Data: " +
                response.getData().orElse("No Data Received"));

        // User preferences without null check
        UserPreferences prefs = new UserPreferences(null, "English");

        System.out.println("Theme: " +
                prefs.getTheme().orElse("Light Mode"));

        System.out.println("Language: " +
                prefs.getLanguage().orElse("English"));
    }
}
