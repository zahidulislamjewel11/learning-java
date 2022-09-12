package com.zahid.spherical;

import com.zahid.spherical.shape.Circle;
import com.zahid.spherical.shape.Cylinder;
import com.zahid.spherical.shape.Shape;
import com.zahid.spherical.shape.Sphere;

public class SphericalTest {
    public static void main(String[] args) {
        // base class reference, derived class object
        System.out.println("[ BASE INTERFACE(Shape) REFERENCE, DERIVED CLASS OBJECT(Circle, Cylinder, Sphere) ]");
        Shape s1 = new Circle(10);
        Shape s2 = new Cylinder(10, 8);
        Shape s3 = new Sphere(10);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();
        
        // derived class reference
        System.out.println("[ BASE CLASS(Circle) REFERENCE, DERIVED CLASS OBJECT(Circle, Cylinder, Sphere) ]");
        Circle c1 = new Circle(10);
        Circle c2 = new Cylinder(10, 8);
        Circle c3 = new Sphere(10);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println();
        
        System.out.println("[ REFERENCE & OBJECT OF SAME CLASS ]");
        Circle circle = new Circle(10);
        Cylinder cylinder = new Cylinder(10, 8);
        Sphere sphere = new Sphere(10);

        System.out.println(circle);
        System.out.println(cylinder);
        System.out.println(sphere);
        System.out.println();
    }
}
