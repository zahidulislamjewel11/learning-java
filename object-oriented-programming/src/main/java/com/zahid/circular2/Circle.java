package com.zahid.circular2;
public class Circle {
    double radius;
    String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "Red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea()
    {
        return radius*radius*Math.PI;
    }
}
