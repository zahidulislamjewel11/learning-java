package com.zahid.quadrilateral;
import com.zahid.quadrilateral.rectangle.Rectangle;
import com.zahid.quadrilateral.triangle.Triangle;

public class QuadrilateralTest {
    public static void main(String[] args) {
            
        Rectangle r = new Rectangle(4, 9);
        
        System.out.println(r);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.isSquare());
        System.out.println();

        Triangle t = new Triangle(6, 8, 10);
        System.out.println(t);
        System.out.println(t.area());
    }
}
