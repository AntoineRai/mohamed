package org.example.creation.prototype;

class PlaneModel extends Model3D {
    public PlaneModel(String size, String color, String texture) {
        super(size, color, texture);
    }

    @Override
    public Model3D clone() {
        return new PlaneModel(this.size, this.color, this.texture);
    }
}
