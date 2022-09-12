package com.zahid.checkedexception2.exception;

public class DenominatorZeroException extends Exception {

    public DenominatorZeroException() {
    }

    public DenominatorZeroException(String message) {
        super(message);
    }
    
}