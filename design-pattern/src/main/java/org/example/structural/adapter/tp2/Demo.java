package org.example.structural.adapter.tp2;

public class Demo {
    public static void main(String[] args) {
        SmsService notificationService = new NotificationAdapter();

        notificationService.sendSms("1234567890", "Ceci est un message de notification !");
        notificationService.sendSms("0987654321", "Votre commande a été expédiée.");
        notificationService.sendSms("5555555555", "Message sans email associé.");
    }
}
