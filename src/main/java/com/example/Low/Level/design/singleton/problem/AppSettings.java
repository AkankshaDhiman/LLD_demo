package com.example.Low.Level.design.singleton.problem;

public class AppSettings {
    private String databaseUrl;
    private String apiKey;

    public AppSettings() {
        databaseUrl= "jdbc:postgres://localhost:5432/database";
        apiKey= "1234-QWERTY";

    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }
}
