package com.example.Low.Level.design.singleton.solution;

public class AppSettings {


    //Step1: private instance of class
    private static AppSettings instance;
    private String databaseUrl;
    private String apiKey;

    //step2 : private constructors to prevent direct object creation
    public AppSettings() {
        databaseUrl= "jdbc:postgres://localhost:5432/database";
        apiKey= "1234-rewq";
    }

    //step 3 : public static method to get instance of this class

    public static AppSettings getInstance() {
        if(instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }
    public String getDatabaseUrl() {
        return databaseUrl;
    }
    public String getApiKey() {
        return apiKey;
    }
}
