package org.example.creation.factory;

class Mage extends Character {
    public Mage() {
        super("Mage", 100, 25);
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("Le Mage utilise la compétence spéciale: Boule de Feu !");
    }
}