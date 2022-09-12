package com.zahid.circular2;
public class CircularTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0, "Blue");
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println();

        Cylinder c3 = new Cylinder();
        Cylinder c4 = new Cylinder(2.0, "Green", 6.0);
        System.out.println(c3.getArea());
        System.out.println(c4.getArea());
    }
}
