package com.example.Low.Level.design.dip;

public class SmsService implements NotificationChannel {
    @Override
    public void send() {
        System.out.println("Notification sent via sms");
    }
}
