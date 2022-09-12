package com.zahid.lambdablock3;
public class NumericFuncTest {
    public static void main(String[] args) {
        NumericFunc isFactor = (n, d) -> n%d==0;

        System.out.println(isFactor.test(144, 24));
        System.out.println(isFactor.test(144, 48));
        System.out.println(isFactor.test(144, 52));
    }
}
