package com.zahid.stringbuffer;
public class StringBufferTest4 {
    public static void main(String[] args) {
        
//        StringBuffer str = new StringBuffer();
        StringBuffer str = new StringBuffer("Java");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());
        str.append("Programming!");
        System.out.println(str);
    }
}
