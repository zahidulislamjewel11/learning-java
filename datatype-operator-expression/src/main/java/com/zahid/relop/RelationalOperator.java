package com.zahid.relop;

public class RelationalOperator {
    public static void main(String[] args) {
        int a = 4, b = 9, c = 2;
        int largest = -1;
        if(a > b && a > c)
        {
            largest = a;
            System.out.printf("%d is largest", largest);
        }
        else if(b > a && b > c)
        {
            largest = b;
            System.out.printf("%d is the largest", largest);
        }
        else if(c > a && c > b)
        {
            largest = a;
            System.out.printf("%d is the largest", largest);
        }

    }
}
