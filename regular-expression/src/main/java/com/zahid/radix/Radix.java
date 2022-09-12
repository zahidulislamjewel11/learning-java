package com.zahid.radix;
import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        String number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number> ");
        number = sc.nextLine();

        if(number.matches("[0-1]+"))
            System.out.printf("%s is binary number\n", number);
        else if(number.matches("[0-7]+"))
            System.out.printf("%s is octal number\n", number);
        else if(number.matches("[0-9]+"))
            System.out.printf("%s is decimal number\n", number);
        else if(number.matches("[0-9A-F]+"))
            System.out.printf("%s is hexa-decimal number\n", number);
        else
            System.out.printf("%s is an invalid number\n", number);

        sc.close();
    }
}
