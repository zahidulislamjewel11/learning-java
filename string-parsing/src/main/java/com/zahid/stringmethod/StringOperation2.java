package com.zahid.stringmethod;

public class StringOperation2 {

    public static void printText(String text) {
        System.out.println(text);
    }

    public static String concatText(String text1, String text2) throws IllegalArgumentException {
        if(text1 == null || text2 == null)
            throw new IllegalArgumentException("Input text is null");
        return text1 + " " + text2;
    }
    public static void main(String[] args) {
        
        String t1 = "Hello";
        String t2 = "World";
        String result = concatText(t1, t2);
        printText(result);
        
        t1 = "Java";
        t2 = null;
        result = concatText(t1, t2);
        printText(result);
    }
}
