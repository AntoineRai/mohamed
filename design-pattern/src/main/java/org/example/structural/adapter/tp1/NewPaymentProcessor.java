package org.example.structural.adapter.tp1;

public class NewPaymentProcessor {
    private String apiKey;

    public void authenticate(String apiKey) {
        this.apiKey = apiKey;
        System.out.println("Authentification réussie avec la clé API : " + apiKey);
    }

    public void sendPayment(double amount) {
        System.out.println("Paiement de " + amount + " effectué via NewPaymentProcessor");
    }
}
