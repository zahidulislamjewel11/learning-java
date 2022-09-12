package com.zahid.stringmethod;

public class StringEquality {
    public static void main (String [] args) {
        
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";
        System.out.println("s1 == Hello " + s1.equals("Hello"));
        System.out.println("s1 == s2 " + s1.equals(s2));
        System.out.println("s1 == s3 " + s1.equals(s3));
        System.out.println("s2 == s3 " + s2.equals(s3));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }
}
