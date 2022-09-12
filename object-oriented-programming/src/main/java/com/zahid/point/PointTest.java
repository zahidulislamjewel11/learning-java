package com.zahid.point;
public class PointTest {
    public static void main(String[] args) {
        Point A = new Point(0, 0);
        System.out.println(A);

        Point B = new Point(4, 0);
        System.out.println(B);

        Point C = new Point(0, 3);
        System.out.println(C);

        Triangle ABC = new Triangle(A, B, C);
        System.out.println(ABC.area());
        
        Triangle DEF = new Triangle(new Point(1,1), new Point(6,13), new Point(13,6));
        System.out.println(DEF.area());
        
        Triangle GHI = new Triangle(new Point(0,0), new Point(4,0), new Point(0,3));
        System.out.println(GHI.area());
        
    }
}