package com.zahid.leapyear;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year> ");
        year = sc.nextInt();

        if((year%4==0 && year%100!=0) || year%400==0)
            System.out.printf("%d is leap year\n", year);
        else
            System.out.printf("%d is NOT leap year\n", year);

        sc.close();
    }
}
