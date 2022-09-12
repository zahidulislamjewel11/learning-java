package com.zahid.lambdablock4;
public class NumericFuncTest {
    public static void main(String[] args) {
        NumericFunc isEven = n -> n%2==0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(9));
        System.out.println();
        
        NumericFunc isNonNeg = n -> n>=0;

        System.out.println(isNonNeg.test(13));
        System.out.println(isNonNeg.test(-4));
    }
}
