package com.zahid.circular1;
public class CircularTest {
    public static void main(String[] args) {
        Shape c1 = new Circle(10);
        System.out.println(c1);
        System.out.println(c1.area());
        System.out.println();

        Shape s1 = new Sphere(10);
        System.out.println(s1);
        System.out.println(s1.area());
        System.out.println();

        Circle c2 = new Circle(20);
        System.out.println(c2);
        System.out.println(c2.area());
        System.out.println();

        Sphere s2 = new Sphere(20);
        System.out.println(s2);
        System.out.println(s2.area());
        System.out.println(s2.volume());
        System.out.println();
    }
}
