package com.zahid.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr8 {
    public static void main(String[] args) {
        String str = "John Jonathan Frank Ken Todd";

        Pattern pat = Pattern.compile("John.*?");
        Matcher mat = pat.matcher(str);

        System.out.println("Original sequence: " + str);
        str = mat.replaceAll("Eric");
        System.out.println("Modified sequence: " + str);
    }
}
