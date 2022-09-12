package com.zahid.geometric;
public class Sphere extends Circle {
    private double radius;

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double area() {
        return 4*super.area();
    }

    public double volume() {
        return (4.0*Math.PI*radius*radius*radius)/3.0;
    }
}
