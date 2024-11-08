package org.example.structural.adapter.tp2;

class EmailService {
    public void sendEmail(String email, String subject, String body) {
        System.out.println("Envoi d'email à : " + email);
        System.out.println("Sujet : " + subject);
        System.out.println("Contenu : " + body);
    }
}
