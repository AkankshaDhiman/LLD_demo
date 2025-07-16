package com.example.Low.Level.design.dip;

public class EmailService implements NotificationChannel {
    @Override
    public void send(){
        System.out.println("Notification sent via email");
    }
}
