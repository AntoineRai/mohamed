package org.example.creation.prototype;

abstract class Model3D implements Cloneable {
    protected String size;
    protected String color;
    protected String texture;

    public Model3D(String size, String color, String texture) {
        this.size = size;
        this.color = color;
        this.texture = texture;
    }

    public abstract Model3D clone();

    @Override
    public String toString() {
        return "Model3D [size=" + size + ", color=" + color + ", texture=" + texture + "]";
    }
}


