package com.zahid.stringmethod;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Zahid";
        String s2 = "Zahid";
        String s3 = new String("Zahid");

        // comparing string objects
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println();

        // comparing memory / reference
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
