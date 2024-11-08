package org.example.structural.bridge;

import org.example.structural.bridge.NotificationSender;

public class SMSSender extends NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Envoie d'un SMS avec ce message : " + message);
    }
}