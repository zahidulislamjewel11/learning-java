package com.zahid.quadratic;
import java.util.Scanner;

public class QuadraticTest {
    public static void main(String[] args) {
        int a, b, c;
        System.out.print("Enter a, b, c > ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        Quadratic q = new Quadratic(a, b, c);
        q.calculate_root();
        System.out.print("Roots are: \n");
        System.out.printf("x1 = %.2f\n", q.getX1());
        System.out.printf("x2 = %.2f\n", q.getX2());
    }
}
