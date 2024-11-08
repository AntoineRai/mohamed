package org.example.creation.prototype;

class HouseModel extends Model3D {
    public HouseModel(String size, String color, String texture) {
        super(size, color, texture);
    }

    @Override
    public Model3D clone() {
        return new HouseModel(this.size, this.color, this.texture);
    }
}
