package org.example.creation.tp.builder;

public class Demo {
    public static void main(String[] args) {
        try {
            Car suvCar = new Car.Builder()
                    .setModel("SUV")
                    .setEngine("Hybride")
                    .setSeats(7)
                    .setColor("Bleu")
                    .addExtra("GPS")
                    .addExtra("Toit ouvrant")
                    .build();
            suvCar.displayCar();

            Car sportCarInvalid = new Car.Builder()
                    .setModel("Sport")
                    .setEngine("Électrique")
                    .setSeats(2)
                    .build();
            sportCarInvalid.displayCar();

            Car suvCarInvalid = new Car.Builder()
                    .setModel("SUV")
                    .setEngine("Hybride")
                    .setSeats(4)
                    .setColor("Bleu")
                    .addExtra("GPS")
                    .addExtra("Toit ouvrant")
                    .addExtra("Climatisation")
                    .build();
            suvCarInvalid.displayCar();
        } catch (IllegalStateException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}

