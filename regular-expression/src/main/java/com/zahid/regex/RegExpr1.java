package com.zahid.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr1 {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches();

        System.out.println("Testing Java agains Java");
        if(found) System.out.println("Matches");
        else System.out.println("No Match");
    }
}