package com.zahid.staticimport;

public class StaticImportTest {
    public static void main(String[] args) {
        System.out.println(Calculator.add(4, 9));
        System.out.println(Calculator.add(4, 9, 2));
        System.out.println(Calculator.add(4, 9, 2, 3));
        System.out.println(Calculator.add(4, 9, 2, 3, 5));
    }
}
