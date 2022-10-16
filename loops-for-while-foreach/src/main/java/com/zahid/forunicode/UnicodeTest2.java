package com.zahid.forunicode;

public class UnicodeTest2 {
    public static void main(String[] args) {
        for(char x = 0x0370; x < 0x03ff; x++) {
            System.out.print(x + " ");
        }

        System.out.println();

        for(char x = 0x0980; x <= 0x09FF; x++)
                System.out.printf(x+ " ");
    }
}
