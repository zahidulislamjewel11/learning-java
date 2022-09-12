package com.zahid.lambdaprint;
import java.util.ArrayList;

public class PrintTest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(9);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);
        numbers.add(0);

        // using enhanced for loop
        for(Integer num:numbers) {
            System.out.print(num+" ");
        }
        System.out.println();

        // using forEach loop
        numbers.forEach( n -> System.out.print(n+" "));
    }
}
