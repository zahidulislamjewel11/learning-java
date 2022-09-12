package com.zahid.spherical.shape;

public class Sphere extends Circle {

    public Sphere(int radius) {
        super(radius);
    }
    
    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(super.getRadius(), 2);
    }

    public double volume() {
        return (4 * Math.PI * Math.pow(super.getRadius(), 3)) * 3.0;
    }

    @Override
    public String toString() {
        return "Sphere [radius=" + super.getRadius() + ", area=" + this.area() + ", volume=" + this.volume()+ "]";
    }
    
}
