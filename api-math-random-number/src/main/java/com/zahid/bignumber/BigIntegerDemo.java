package com.zahid.bignumber;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        for(int i=0; i<=100; i++) {
            calculateFactorial(i);
        }
    }

    private static void calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;

        for(int i=1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n + "! = "+result);
    }
}
