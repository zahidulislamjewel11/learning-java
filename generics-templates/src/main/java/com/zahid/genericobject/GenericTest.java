package com.zahid.genericobject;

public class GenericTest {
    public static void main(String[] args) {
        Generic<Integer> intObj = new Generic<Integer>(88);
        intObj.showType();
        int value = intObj.getObj();
        System.out.println(value);
        System.out.println();

        Generic<String> strObj = new Generic<String>("Hello, there");
        strObj.showType();
        String str = strObj.getObj();
        System.out.println(str);
        System.out.println();

        Generic<Double> dbObj = new Generic<Double>(2.718281828459045);
        dbObj.showType();
        double db = dbObj.getObj();
        System.out.println(db);
    }
}
