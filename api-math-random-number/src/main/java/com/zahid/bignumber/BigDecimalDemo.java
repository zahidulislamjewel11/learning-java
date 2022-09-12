package com.zahid.bignumber;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigInteger bigInt0 = BigInteger.ZERO;
        BigInteger bigInt1 = BigInteger.ONE;
        BigInteger bigInt5 = BigInteger.valueOf(5);
        BigInteger bigInt10 = BigInteger.TEN;
        BigInteger aVeryLargeInt = new BigInteger("143216543165131653");

        System.out.println(bigInt0);
        System.out.println(bigInt1);
        System.out.println(bigInt5);
        System.out.println(bigInt10);
        System.out.println(aVeryLargeInt);

        BigInteger add = bigInt1.add(bigInt0);
        BigInteger sub = bigInt1.subtract(bigInt0);
        BigInteger mul = bigInt5.multiply(bigInt10);
        BigInteger div = aVeryLargeInt.divide(bigInt5);

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        BigDecimal d = new BigDecimal("1115.32");
        BigDecimal taxRate = new BigDecimal("0.0049");
        BigDecimal d2 = d.multiply(taxRate);
        System.out.println(d);
        System.out.println(taxRate);
        System.out.println(d2);

        BigDecimal P = new BigDecimal("3.1415926535897932384626433832795028841971");
        BigDecimal E = BigDecimal.valueOf(2.718281828459045);
        BigDecimal R = P.add(E);
        System.out.println(P);
        System.out.println(E);
        System.out.println(R);

    }
}
