package org.example.creation.factory;

class CharacterFactory {
    public static Character createCharacter(String type) {
        return switch (type.toLowerCase()) {
            case "warrior" -> new Warrior();
            case "mage" -> new Mage();
            case "archer" -> new Archer();
            default -> throw new IllegalArgumentException("Type de personnage inconnu: " + type);
        };
    }
}