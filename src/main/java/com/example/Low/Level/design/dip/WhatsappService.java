package com.example.Low.Level.design.dip;

public class WhatsappService implements NotificationChannel {

    @Override
    public void send(){
        System.out.println("Notification sent via whatsapp");
    }
}
