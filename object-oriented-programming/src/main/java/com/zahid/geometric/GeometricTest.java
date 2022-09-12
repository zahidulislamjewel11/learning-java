package com.zahid.geometric;

public class GeometricTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 9);
        System.out.println("Area of Rectangle: "+r.area());
        System.out.println();

        Circle c = new Circle(5);
        System.out.println("Area of Circle: "+c.area());
        System.out.println();

        Cylinder c1 = new Cylinder(5, 6);
        System.out.println("Area of Cylinder: "+c1.area());
        System.out.println("Volume of Cylinder: "+c1.volume());
        System.out.println();

        Sphere s = new Sphere(5);
        System.out.println("Area of Sphere: "+s.area());
        System.out.println("Volume of Sphere: "+s.volume());
    }
}
