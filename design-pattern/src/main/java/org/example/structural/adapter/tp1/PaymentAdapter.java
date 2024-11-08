package org.example.structural.adapter.tp1;

class PaymentAdapter implements OldPaymentGateway {
    private NewPaymentProcessor newProcessor;
    private String apiKey;

    public PaymentAdapter(String apiKey) {
        this.newProcessor = new NewPaymentProcessor();
        this.apiKey = apiKey;
        this.newProcessor.authenticate(apiKey);
    }

    @Override
    public void makePayment(String accountNumber, double amount) {
        System.out.println("Utilisation de l'adaptateur pour faire un paiement sur le compte : " + accountNumber);
        newProcessor.sendPayment(amount);
    }
}