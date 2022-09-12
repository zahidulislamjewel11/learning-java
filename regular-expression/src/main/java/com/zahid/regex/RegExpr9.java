package com.zahid.regex;
import java.util.regex.Pattern;

public class RegExpr9 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("[ ,.!]");

        String strs[] = pat.split("one two,alpha9 12!done.");

        for(String str:strs) {
            System.out.println("Next token: " + str);
        }
    }
}
