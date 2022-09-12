package com.zahid.circular1;
public class Sphere extends Circle {

    public Sphere() {
    }

    public Sphere(int radius) {
        super(radius);
    }

    @Override
    public double area() {
        return 4 * super.area();
    }

    public double volume() {
        return (4 * Math.PI * Math.pow(super.getRadius(), 3)) / 3.0;
    }

    @Override
    public String toString() {
        return "Sphere [radius=" + super.getRadius() + "]";
    }

}
