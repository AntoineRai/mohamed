package org.example.creation.factory;

public class Demo {
    public static void main(String[] args) {
        Character warrior = CharacterFactory.createCharacter("warrior");
        Character mage = CharacterFactory.createCharacter("mage");
        Character archer = CharacterFactory.createCharacter("archer");

        System.out.println(warrior.toString());
        warrior.useSpecialSkill();

        System.out.println(mage.toString());
        mage.useSpecialSkill();

        System.out.println(archer.toString());
        archer.useSpecialSkill();
    }
}