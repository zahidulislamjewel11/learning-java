package com.zahid.calculator;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int add(int[] values) {
        int sum = 0;
        for(int value: values) {
            sum += value;
        }
        return sum;
    }
}