package com.zahid.lambdablock1;

public class NumericFuncTest {
    public static void main(String[] args) {
        NumericFunc fact = n -> {
            int result=1;
            for(int i=1;i<=n;i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(fact.func(5));
        System.out.println(fact.func(10));
    }
}
