package com.zahid.quadratic;
import java.lang.Math;

public class Quadratic {
    int a, b, c;
    float x1, x2;

    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    int discriminant()
    {
        System.out.println(b*b-4*c*a);
        return b*b - 4*c*a;
    }

    void calculate_root()
    {
        int D = this.discriminant();
        if(D>=0) {
            this.x1 = (float)(-b+Math.sqrt(D))/(2*a);
            this.x2 = (float)(-b-Math.sqrt(D))/(2*a);
        }
        else {
            this.x1 = 0f;
            this.x2 = 0f;
        }
    }

    public float getX1() {
        return x1;
    }

    public float getX2() {
        return x2;
    }
}
