package com.zahid.calculator1;
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(4, 9));
        System.out.println(cal.sub(8, 1));
        System.out.println(cal.mul(2, 3));
        System.out.println(cal.div(9, 2));
        System.out.println(cal.mod(9, 2));
    }
}
