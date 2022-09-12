package com.zahid.arithmeticexception;

public class ArithmeticExceptionTest {
    public static void main(String[] args) {
        int a=1;
        int b=0;

        int result=0;

        try
        {
            result=divide(a, b);
        }
//        catch (ArithmeticException e)
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("You cannot divide "+a+" by "+b);
            System.out.println(e.getMessage());
            System.out.println(e.toString());

        }

        System.out.println("Result: "+result);
    }

    public static int divide(int x, int y)
    {
        return x/y;
    }
}
