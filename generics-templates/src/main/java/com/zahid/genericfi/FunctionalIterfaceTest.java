package com.zahid.genericfi;

public class FunctionalIterfaceTest {
    public static void main(String[] args) {

        // using anonymous inner class
        SomeFunc<String> textReverser = new SomeFunc<String>() {
            
            @Override
            public String func(String t) {
                StringBuilder sb = new StringBuilder(t);
                String reverseText = sb.reverse().toString();
                return reverseText;
            }
            
        };
        
        // using lambda expression
        SomeFunc<String> reverse = str -> {
            String result = "";
            int i;

            for(i = str.length()-1; i>=0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println(reverse.func("Zahid"));
        System.out.println(reverse.func("LambdaExpression"));
        System.out.println(textReverser.func("Palindrome"));
        System.out.println();

        SomeFunc<Integer> factCalculator = n -> {
            int result = 1;

            for(int i=1;i<=n;i++) {
                result *=i;
            }

            return result;
        };

        System.out.println(factCalculator.func(10));
        System.out.println(factCalculator.func(5));
    }
}
