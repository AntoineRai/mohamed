package org.example.creation.prototype;

public class Demo {
    public static void main(String[] args) {
        Model3D houseModel = new HouseModel("Grande", "Blanc", "TextureBrique");
        System.out.println("Original: " + houseModel);

        Model3D houseClone = houseModel.clone();
        System.out.println("Clone: " + houseClone);

        houseClone.color = "Bleu";
        System.out.println("Clone personnalisé: " + houseClone);

        Model3D carModel = new CarModel("Moyenne", "Rouge", "TextureMétallique");
        System.out.println("Original: " + carModel);

        Model3D carClone = carModel.clone();
        System.out.println("Clone de la voiture: " + carClone);
    }
}
