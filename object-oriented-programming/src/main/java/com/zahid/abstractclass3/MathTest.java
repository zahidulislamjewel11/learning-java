package com.zahid.abstractclass3;

public class MathTest
{
    public static void main(String args[])
    {
        Arithmetic obj = new Arithmetic();
        int addition = obj.add(4, 9);
        int subtraction = obj.subtract(8, 6);

        System.out.println(addition);
        System.out.println(subtraction);
    }
}