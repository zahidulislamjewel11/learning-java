package com.zahid.lambdablock5;

public class NumberTest {
    public static void main(String[] args) {
        Number myNum;

        myNum = () -> 123.45;
        System.out.println(myNum.getValue());

        myNum = () -> Math.random()*100;
        System.out.println(myNum.getValue());
    }
}
