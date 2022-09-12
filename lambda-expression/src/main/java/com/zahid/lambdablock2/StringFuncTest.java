package com.zahid.lambdablock2;

public class StringFuncTest {
    public static void main(String[] args) {
        StringFunc reverse = str -> {
            String result = "";
            int i;

            for(i=str.length()-1;i>=0;i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println(reverse.func("Lambda"));
        System.out.println(reverse.func("Expression"));
    }
}
