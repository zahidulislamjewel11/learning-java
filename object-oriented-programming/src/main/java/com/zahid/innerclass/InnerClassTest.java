package com.zahid.innerclass;

import com.zahid.innerclass.math.Math;
import com.zahid.innerclass.math.Summation;

public class InnerClassTest {
    public static void main(String[] args) {
        
        // anynomous inner class
        Math math = new Math(){

            @Override
            public int add(int x, int y) {
                return x + y;
            }

            @Override
            public int sub(int x, int y) {
                return x - y;
            }

            @Override
            public int mul(int x, int y) {
                return x * y;
            }

            @Override
            public int div(int x, int y) {
                return x / y;
            }

            @Override
            public int mod(int x, int y) {
                return x % y;
            }
            
        };

        System.out.println(math.add(4, 9));
        System.out.println(math.sub(13, 9));
        System.out.println(math.mul(5, 6));
        System.out.println(math.div(18, 6));
        System.out.println(math.mod(19, 5));

        // lambda through functional interface 
        Summation s = (int x, int y) -> x + y;
        System.out.println(s.sum(40, 90));

        // functional interface + anonymous inner class
        Summation t = new Summation(){

            @Override
            public int sum(int x, int y) {
                return x + y;
            }
            
        };

        System.out.println(t.sum(20, 30));

    }

}
