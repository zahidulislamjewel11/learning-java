package com.zahid.generictuple;

public class TupleTest {
    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<String, String>("Hello", "World");
        tuple.showType();
        System.out.println();

        Tuple<String, Integer> person = new Tuple<String, Integer>("Rahim", 28);
        person.showType();
        System.out.println();

        Tuple<Double, Double> constant = new Tuple<Double, Double>(2.718281828459045, 3.141592653589793);
        constant.showType();
        System.out.println();
    }
}
