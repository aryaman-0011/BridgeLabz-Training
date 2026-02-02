package com.optionalclass.scenario5;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConfigService {

    private Map<String, String> config = new HashMap<>();

    public ConfigService() {
        config.put("app.name", "StreamApp");
        // file.path intentionally missing
    }

    // 1. Read config safely
    public Optional<String> getConfig(String key) {
        return Optional.ofNullable(config.get(key));
    }

    // 2. Fetch environment variable safely
    public Optional<String> getEnv(String key) {
        return Optional.ofNullable(System.getenv(key));
    }
}
