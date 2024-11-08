package org.example.structural.adapter.tp2;

import java.util.HashMap;
import java.util.Map;

class NotificationAdapter implements SmsService {
    private EmailService emailService;
    private Map<String, String> phoneToEmailMap;

    public NotificationAdapter() {
        this.emailService = new EmailService();
        this.phoneToEmailMap = new HashMap<>();

        phoneToEmailMap.put("1234567890", "user1@example.com");
        phoneToEmailMap.put("0987654321", "user2@example.com");
    }

    @Override
    public void sendSms(String number, String message) {
        String email = phoneToEmailMap.get(number);
        if (email != null) {
            String subject = "Notification SMS";
            emailService.sendEmail(email, subject, message);
        } else {
            System.out.println("Erreur : aucun email associé au numéro " + number);
        }
    }
}
