package org.example.structural.adapter.tp1;

public class Demo {
    public static void main(String[] args) {
        // Clé API pour le nouveau système de paiement
        String apiKey = "new-api-key-12345";

        // Création de l'adaptateur pour utiliser le nouveau système de paiement avec l'interface de l'ancien
        OldPaymentGateway paymentGateway = new PaymentAdapter(apiKey);

        // Utilisation de l'interface OldPaymentGateway pour faire un paiement
        paymentGateway.makePayment("123456789", 250.75);
    }
}