package com.optionalclass.scenario5;

import java.util.Optional;

public class ApiResponse {

    private String data;

    public ApiResponse(String data) {
        this.data = data;
    }

    // 4. Safe API value handling
    public Optional<String> getData() {
        return Optional.ofNullable(data);
    }
}
