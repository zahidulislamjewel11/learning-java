package com.zahid.generictuple;

public class Tuple<X, Y> {
    private X a;
    private Y b;

    public Tuple(X a, Y b) {
        this.a = a;
        this.b = b;
    }

    public X getA() {
        return a;
    }

    public Y getB() {
        return b;
    }

    public void showType()
    {
        System.out.println("Type of X is: " + a.getClass().getName() + " and value: " + a);
        System.out.println("Type of Y is: " + b.getClass().getName() + " and value: " + b);
    }
}
