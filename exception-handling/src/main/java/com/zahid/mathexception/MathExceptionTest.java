package com.zahid.mathexception;

import com.zahid.mathexception.exception.DenominatorZeroException;
import com.zahid.mathexception.exception.NonNegativeException;
import com.zahid.mathexception.exception.ZeroResultException;
import com.zahid.mathexception.math.Math;

public class MathExceptionTest {

    public static void main(String[] args) {

        Math m = new Math();

        try {
            System.out.println(m.add(4, -9));
        } catch (NonNegativeException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(m.sub(4, 9));
        } catch (NonNegativeException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println(m.mul(4, 0));
        } catch (ZeroResultException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println(m.div(10, 0));
        } catch (DenominatorZeroException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
        
        try {
            System.out.println(m.mod(10, 0));
        } catch (DenominatorZeroException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }
        
    }
}