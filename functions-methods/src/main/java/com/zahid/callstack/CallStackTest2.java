package com.zahid.callstack;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("Inside Main method");
        methodA();
        System.out.println("Exiting Main method");
    }

    public static void methodA()
    {
        System.out.println("Inside method A");
        methodB();
        System.out.println("Exiting method A");
    }
    public static void methodB()
    {
        System.out.println("Inside method B");
        methodC();
        System.out.println("Exiting method B");
    }
    public static void methodC()
    {
        System.out.println("Inside method C");
        methodD();
        System.out.println("Exiting method C");
    }
    public static void methodD()
    {
        System.out.println("Inside method D");
        try {
            System.out.println(5/0);
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by zero. " + e);
        }
        System.out.println("Exit ing method D");
    }
}
