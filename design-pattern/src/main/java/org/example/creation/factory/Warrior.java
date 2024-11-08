package org.example.creation.factory;

class Warrior extends Character {
    public Warrior() {
        super("Warrior", 150, 20);
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("Le Guerrier utilise la compétence spéciale: Coup Puissant !");
    }
}
