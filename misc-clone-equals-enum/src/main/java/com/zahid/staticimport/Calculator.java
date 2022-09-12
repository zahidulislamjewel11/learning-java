package com.zahid.staticimport;

public class Calculator {

    public Calculator() {}

    public static int add(int x, int y, int...z) {
        int sum = 0;
        sum = x + y;

        for(int i=0; i<z.length; i++)
            sum += z[i];
        return sum;
    }
}