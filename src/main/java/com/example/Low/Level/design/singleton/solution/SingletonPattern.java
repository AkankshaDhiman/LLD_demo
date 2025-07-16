package com.example.Low.Level.design.singleton.solution;

public class SingletonPattern {


    public static void main(String[] args) {
        AppSettings appSettings1=AppSettings.getInstance();
        AppSettings appSettings2=AppSettings.getInstance();

        System.out.println(appSettings1.getApiKey());
        System.out.println(appSettings2.getApiKey());

        System.out.println(appSettings1==appSettings2);
    }
}
