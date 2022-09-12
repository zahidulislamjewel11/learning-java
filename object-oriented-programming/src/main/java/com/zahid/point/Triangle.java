package com.zahid.point;
public class Triangle implements Shape {
    public Point A;
    public Point B;
    public Point C;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    public double area() {
        return Utility.getDeterminant(A, B, C);
    }
}