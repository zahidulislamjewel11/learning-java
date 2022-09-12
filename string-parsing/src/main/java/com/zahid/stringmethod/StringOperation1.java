package com.zahid.stringmethod;
import java.io.UnsupportedEncodingException;

public class StringOperation1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String greeting = "Hello world!";
        String str = new String("Hello there.");
        char[] helloArray = {'H', 'e', 'l', 'l', 'o'};
        String helloString = new String(helloArray);
        byte[] data = new byte[] {(byte)97, (byte)98, (byte)99};
        String abc = new String(data, "UTF-8");

        System.out.println(greeting);
        System.out.println(str);
        System.out.println(helloArray);
        System.out.println(helloString);
        System.out.println(abc);
        System.out.println();
    }
}
