package com.zahid.calculator2;
import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Calc t = new Calc();
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number> ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number> ");
        b = sc.nextInt();

        System.out.println(t.add(a, b));
        System.out.println(t.sub(a, b));
        System.out.println(t.mul(a, b));
        System.out.println(t.div(a, b));
        System.out.println(t.mod(a, b));
    }
}
