package com.zahid.triangle;
import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
/*
        Triangle t = new Triangle(4, 9, 2);
        System.out.printf("Perimeter = %f \n", t.perimeter());
        System.out.printf("Area = %f \n", t.area());
*/

        float a, b, c;
        System.out.println("Enter three sides of the triangle> ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        Triangle t1 = new Triangle(a, b, c);
        System.out.printf("Perimeter = %f \n", t1.perimeter());
        System.out.printf("Area = %f \n", t1.area());

        sc.close();
    }
}
