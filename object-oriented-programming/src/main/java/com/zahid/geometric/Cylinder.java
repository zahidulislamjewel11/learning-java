package com.zahid.geometric;
public class Cylinder extends Circle {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double area() {
        return 2*Math.PI*radius*(radius+height);
    }

    public double volume() {
        return super.area()*height;
    }
}
