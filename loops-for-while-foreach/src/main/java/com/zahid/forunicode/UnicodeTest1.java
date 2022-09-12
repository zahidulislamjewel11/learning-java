package com.zahid.forunicode;

public class UnicodeTest1 {
    public static void main(String[] args) {

        System.out.println("Greek");
        for(char x=0x0370; x<=0x03FF; x++)
            System.out.print(x+ " ");
        System.out.println("\n");

        System.out.println("Bengali");
        for(char x=0x0980; x<=0x09FF; x++)
            System.out.print(x+ " ");
        System.out.println("\n");

        System.out.println("Devanagari");
        for(char x=0x0900; x<=0x097F; x++)
            System.out.print(x+ " ");
        System.out.println("\n");
    }
}
