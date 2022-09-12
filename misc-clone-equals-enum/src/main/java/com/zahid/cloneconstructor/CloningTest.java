package com.zahid.cloneconstructor;

import com.zahid.cloneconstructor.point.Point;

public class CloningTest {
    public static void main(String[] args) {
        Point p1 = new Point(4, 9);
        Point p2 = new Point(p1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        p1.setX(2);
        p1.setY(3);
        System.out.println();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
