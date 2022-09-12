package com.zahid.genericfi;

public class FunctionalIterfaceTest {
    public static void main(String[] args) {
        SomeFunc<String> reverse = str -> {
            String result = "";
            int i;

            for(i=str.length()-1;i>=0;i--) {
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println(reverse.func("Zahid"));
        System.out.println(reverse.func("LambdaExpression"));
        System.out.println();

        SomeFunc<Integer> fact = n -> {
            int result = 1;

            for(int i=1;i<=n;i++) {
                result *=i;
            }

            return result;
        };

        System.out.println(fact.func(10));
        System.out.println(fact.func(5));
    }
}
