package org.example.creation.factory;

class Archer extends Character {
    public Archer() {
        super("Archer", 120, 15);
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("L'Archer utilise la compétence spéciale: Tir Précis !");
    }
}