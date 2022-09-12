package com.zahid.methodoverloading.maxima;

public class MaximaTest {
    public static void main(String[] args) {
        Maxima t = new Maxima();
        System.out.println(t.max(4, 9));
        System.out.println(t.max(4.2f, 9.3f));
        System.out.println(t.max(4, 9,2));
    }
}
