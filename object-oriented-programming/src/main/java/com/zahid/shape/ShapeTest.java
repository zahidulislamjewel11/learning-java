package com.zahid.shape;
public class ShapeTest {
    public static void main(String[] args) throws Exception {
        Rectangle r = new Rectangle(4, 9);
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println();

        Circle c = new Circle(10);
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
    }
}
