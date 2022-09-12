package com.zahid.checkedexception2;

import com.zahid.checkedexception2.calculate.Math;
import com.zahid.checkedexception2.exception.DenominatorNotNumberException;
import com.zahid.checkedexception2.exception.DenominatorZeroException;

public class CheckedException {
    public static void main(String[] args) {
        Math math = new Math();

        try {
            System.out.println(math.divide(48, 15));
        } catch (DenominatorZeroException | DenominatorNotNumberException e) {
            e.printStackTrace();
            // System.out.println(e);
            // System.out.println(e.toString());
            // System.out.println(e.getMessage());
            // System.err.println(e);
        }

        Math m = new Math();
        try {
            System.out.println(m.divide(1, 0));
        } catch (DenominatorZeroException | DenominatorNotNumberException e) {
            // e.printStackTrace();
            // System.out.println(e);
            // System.out.println(e.toString());
            // System.out.println(e.getMessage());
            System.err.println(e);
        }

        Math m2 = new Math();
        try {
            System.out.println(m2.divide(10, 2));
        } catch (DenominatorZeroException | DenominatorNotNumberException e) {
            // e.printStackTrace();
            // System.out.println(e);
            // System.out.println(e.toString());
            // System.out.println(e.getMessage());
            System.err.println(e);
        }
    }
}
