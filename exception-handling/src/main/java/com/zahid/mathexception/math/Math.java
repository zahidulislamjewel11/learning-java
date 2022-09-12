package com.zahid.mathexception.math;

import com.zahid.mathexception.exception.DenominatorZeroException;
import com.zahid.mathexception.exception.NonNegativeException;
import com.zahid.mathexception.exception.ZeroResultException;

public class Math {

    public Math() {
    }
    
    public int add(int x, int y) throws NonNegativeException {
        if(x < 0 || y < 0)
            throw new NonNegativeException("Input number cannot be negative");
        else
            return x + y;
    }

    public int sub(int x, int y) throws NonNegativeException {
        if(x < 0 || y < 0 || (x-y) < 0)
            throw new NonNegativeException("Negative input or result not allowed");
        else
            return x - y;
    }

    public int mul(int x, int y) throws ZeroResultException {
        if(x * y == 0)
            throw new ZeroResultException("Result cannot be zero");
        else
            return x * y;
    }

    public double div(int x, int y) throws DenominatorZeroException {
        if(y == 0)
            throw new DenominatorZeroException("Denominator cannot be zero");
        else
            return x / y;
    }

    public int mod(int x, int y) throws DenominatorZeroException {
        if(y == 0)
            throw new DenominatorZeroException("Denominator cannot be zero");
        else
            return x % y;
    }
}
