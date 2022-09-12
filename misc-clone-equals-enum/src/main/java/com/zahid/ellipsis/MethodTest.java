package com.zahid.ellipsis;

public class MethodTest {
    static int sum(int ...A) {
        int s=0;
        for (int x:A)
            s+=x;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(4));
        System.out.println(sum(4, 9));
        System.out.println(sum(4, 9, 2));
        System.out.println(sum(new int[]{4, 9, 2, 3, 5}));
    }
}
