package com.example.Low.Level.design.dip;

public class Main {
    public static void main(String[] args) {
        NotificationChannel email = new EmailService();
        NotificationChannel sms = new SmsService();
        NotificationChannel whatsapp = new WhatsappService();


        NotificationService service = new NotificationService(email);
        service.notifyUser();

        NotificationService service2 = new NotificationService(sms);
        service2.notifyUser();

        NotificationService service3 = new NotificationService(whatsapp);
        service3.notifyUser();
    }

}
