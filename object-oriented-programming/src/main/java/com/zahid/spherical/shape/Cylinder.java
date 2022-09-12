package com.zahid.spherical.shape;

public class Cylinder extends Circle {
    
    private int height;

    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * Math.PI * super.getRadius() * (super.getRadius() + height);
    }

    public double volume() {
        return Math.PI * Math.pow(super.getRadius(), 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + this.height + ", radius=" + super.getRadius() + ", area=" + this.area() + ", volume=" + this.volume()+ "]";
    }
    
    
}
