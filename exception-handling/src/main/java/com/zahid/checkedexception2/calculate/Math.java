package com.zahid.checkedexception2.calculate;

import com.zahid.checkedexception2.exception.DenominatorNotNumberException;
import com.zahid.checkedexception2.exception.DenominatorZeroException;
import com.zahid.checkedexception2.utility.Utility;

public class Math {

    public Math() {
    }
    
    public double divide(int x, int y) throws DenominatorZeroException, DenominatorNotNumberException {
        if(y == 0) 
            throw new DenominatorZeroException("Denominator Cannot be Zero");

        else if(Utility.isNumeric("" + y) == false) 
            throw new DenominatorNotNumberException("Denominator Not a Number");
        else 
            return x / y;
    }
    
}
