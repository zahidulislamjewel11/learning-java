package com.zahid.collection;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        List<Double> decimalList = new Vector<>();
        decimalList.add(2.718281828459095);
        decimalList.add(3.141592653589793);
        System.out.println(decimalList);
        System.out.println(decimalList.size());
    }
}
