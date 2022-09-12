package com.zahid;

import com.zahid.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int actual = calculator.add(4, 9);
        int expected = 13;

        if(expected == actual) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
