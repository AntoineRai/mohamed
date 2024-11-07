package org.example.creation.tp.builder;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String model;
    private final String engine;
    private final String color;
    private final int seats;
    private final List<String> extras;

    private Car(Builder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.color = builder.color;
        this.seats = builder.seats;
        this.extras = builder.extras;
    }

    public void displayCar() {
        System.out.println("Modèle: " + model);
        System.out.println("Moteur: " + engine);
        System.out.println("Couleur: " + color);
        System.out.println("Sièges: " + seats);
        System.out.println("Extras: " + extras);
    }

    public static class Builder {
        // Obligatoire
        private String model;
        private String engine;
        private int seats;

        // Optionnel
        private String color = "undefined";
        private List<String> extras = new ArrayList<>();

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Builder addExtra(String extra) {
            extras.add(extra);
            return this;
        }

        public Car build() {
            if (model == null || engine == null || seats == 0) {
                throw new IllegalStateException("Modèle, moteur, et nombre de sièges sont obligatoires.");
            }
            if (model.equals("Sport") && engine.equals("Électrique")) {
                throw new IllegalStateException("Un modèle Sport ne peut pas avoir de moteur électrique.");
            }
            if (model.equals("SUV") && seats < 5) {
                throw new IllegalStateException("Un SUV doit avoir au moins 5 sièges.");
            }
            return new Car(this);
        }
    }
}

