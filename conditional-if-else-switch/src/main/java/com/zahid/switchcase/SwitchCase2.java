package com.zahid.switchcase;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        String ch;
        System.out.print("Enter a character> ");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextLine();
/*
        if(ch.equals("A"))
            System.out.printf("%s is vowel", ch);
        else if(ch.equals("a"))
            System.out.printf("%s is vowel", ch);

        else if(ch.equals("E"))
            System.out.printf("%s is vowel", ch);
        else if(ch.equals("e"))
            System.out.printf("%s is vowel", ch);

        else if(ch.equals("I"))
            System.out.printf("%s is vowel", ch);
        else if(ch.equals("i"))
            System.out.printf("%s is vowel", ch);

        else if(ch.equals("O"))
            System.out.printf("%s is vowel", ch);
        else if(ch.equals("o"))
            System.out.printf("%s is vowel", ch);

        else if(ch.equals("U"))
            System.out.printf("%s is vowel", ch);
        else if(ch.equals("u"))
            System.out.printf("%s is vowel", ch);

        else
            System.out.printf("%s is NOT vowel", ch);

 */
        switch (ch)
        {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.printf("%s is vowel\n", ch);
                break;
            default:
                System.out.printf("%s is NOT vowel\n", ch);
        }
    }
}
