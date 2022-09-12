package com.zahid.stringmethod;

import java.util.Date;

/**
 * StringExample
 */
public class StringMethod4 {

    public static void main(String[] args) {

        // date object to string
        Date date = new Date();
        String dateString = date.toString();
        System.out.println(dateString);

        // byte array to string
        byte[] data = new byte[]{97, 98, 99, 100, 101};
        String stringData = new String(data);
        System.out.println(stringData);
        System.out.println(stringData.length());
        System.out.println(stringData.charAt(2));
        System.out.println(stringData.toUpperCase());
        System.out.println(stringData.toLowerCase());
        System.out.println(stringData.indexOf('b'));

        System.out.println(String.valueOf(3.14159f));
        System.out.println(String.valueOf(1));

        System.out.println("abc".equals("abc"));
        System.out.println("abc".equals("ABC"));
        System.out.println("abc".equalsIgnoreCase("ABC"));

        String myName = "Zahidul Islam Jewel";
        System.out.println(myName.contains("Jewel"));
        System.out.println(myName.startsWith("Jewel"));
        System.out.println(myName.endsWith("Jewel"));

        String yourName = " Tonmoy Hasan Robi ";
        System.out.println(yourName);
        System.out.println(yourName.length());
        yourName.trim(); // returns copy
        System.out.println(yourName);
        System.out.println(yourName.length());
        System.out.println(yourName.trim());
        System.out.println(yourName.trim().length());
    }
}