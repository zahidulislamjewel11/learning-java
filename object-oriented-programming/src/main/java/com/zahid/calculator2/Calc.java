package com.zahid.calculator2;
public class Calc {
    private int x;
    private int y;

    public Calc()
    {

    }
    public Calc(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int add(int x, int y)
    {
        return x+y;
    }
    public int sub(int x, int y)
    {
        return x-y;
    }
    public int mul(int x, int y)
    {
        return x*y;
    }
    public int div(int x, int y)
    {
        return x/y;
    }
    public int mod(int x, int y)
    {
        return x%y;
    }

}
