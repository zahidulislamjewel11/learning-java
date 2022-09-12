package com.zahid.triangle;

public class Triangle {
    float a, b, c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float perimeter()
    {
        return a + b + c;
    }

    public double area()
    {
        float s = (float)this.perimeter() / 2;

        return Math.sqrt(Math.abs(s*(s-a)*(s-b)*(s-c)));
    }

}
