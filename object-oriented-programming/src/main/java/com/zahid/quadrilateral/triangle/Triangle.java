package com.zahid.quadrilateral.triangle;

public class Triangle {
    
    int a, b, c;
    double s;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = (double) (a + b + c) / 2;
    }

    public double area() {
        
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", s=" + s + "]";
    }

    
}
