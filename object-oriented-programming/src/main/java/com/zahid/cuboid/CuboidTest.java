package com.zahid.cuboid;
import java.lang.*;
import java.util.Scanner;

public class CuboidTest {
    public static void main(String[] args) {
        int length, breadth, height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length, breath, height> ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        Cuboid c = new Cuboid(length, breadth, height);
        System.out.printf("Area = %.2f\n", c.area());
        System.out.printf("Volume = %.2f\n", c.volume());

    }
}
