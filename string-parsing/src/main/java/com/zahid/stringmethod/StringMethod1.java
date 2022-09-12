package com.zahid.stringmethod;
import java.util.ArrayList;
import java.util.Date;

public class StringMethod1 {
    public static void main(String[] args) {

        // toString()
        Date date = new Date();
        System.out.println(date);
        String dateString = date.toString();
        System.out.println(dateString);
        System.out.println();

        // valueOf()
        String one = String.valueOf(1);
        System.out.println(one);
        String two = String.valueOf(2.384f);
        System.out.println(two);
        String notTrue = String.valueOf(false);
        System.out.println(notTrue);
        System.out.println();

        // concat()
        String str1 = "My Name is: ";
        String str2 = "Jewel";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println();

        // length()
        String loremIpsum = "Lorem ipsum dolor sit amet";
        int len = loremIpsum.length();
        System.out.println(len);
        System.out.println();

        // charAt()
        char ch = loremIpsum.charAt(0);
        System.out.println(ch);
        System.out.println();

        // substring()
        String sub = loremIpsum.substring(0, 5);
        System.out.println(sub);
        System.out.println(sub.length());
        System.out.println(loremIpsum.substring(4, 9));
        System.out.println();

        // toLowerCase()
        String hello = "Hello";
        System.out.println(hello.toLowerCase());
        System.out.println();

        // toUpperCase()
        String hi = "Hi, there";
        System.out.println(hi.toUpperCase());
        System.out.println();

        // indexOf()
        System.out.println(loremIpsum.indexOf('i'));
        System.out.println(loremIpsum.indexOf('w'));
        System.out.println();

        // lastIndexOf()
        System.out.println(loremIpsum.lastIndexOf('i'));
        System.out.println(loremIpsum.lastIndexOf('k'));
        System.out.println();

        // equals()
        System.out.println("abc".equals("ABC"));
        System.out.println("ABC".equals("ABC"));
        System.out.println();

        // equalsIgnoreCase()
        System.out.println("abc".equalsIgnoreCase("ABC"));
        System.out.println("ABC".equalsIgnoreCase("ABC"));
        System.out.println();

        // contains()
        String west = "Once upon a time in the wild west..";
        System.out.println(west.contains("west"));
        System.out.println(west.contains("east"));
        System.out.println();

        // startsWith()
        System.out.println(west.startsWith("Once"));
        System.out.println(west.startsWith("Nowhere"));
        System.out.println();

        // endsWith()
        System.out.println(west.endsWith("gone"));
        System.out.println(west.endsWith(".."));
        System.out.println();

        // replace()
        String line = "lorem ipsum dolor sit amet";
        System.out.println(line.replace('i', 'X'));
        System.out.println(line.replace('o', 'X'));
        System.out.println();

        // trim()
        String untrimmed="   Hello there ";
        System.out.println(untrimmed.trim());
        System.out.println();

        // indent()
        System.out.println(west);
        // System.out.println(west.indent(5)); // not in java 11, from 12 onwards
        System.out.println();

        // transform()
        String s = "Hi, Hello, Howdy";


    }
}
