package com.example.Low.Level.design.dip;


public class NotificationService {

    private NotificationChannel channel;

    public NotificationService(NotificationChannel channel) {
        this.channel = channel;
    }

    public void notifyUser(){
        channel.send();
    }
}

