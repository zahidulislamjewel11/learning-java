package com.zahid.lambdaforeach;
import java.util.ArrayList;

public class IterationTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(4);
        arrL.add(9);
        arrL.add(2);
        arrL.add(3);
        arrL.add(5);
        arrL.add(7);
        arrL.add(8);
        arrL.add(1);
        arrL.add(6);
        arrL.add(0);

        arrL.forEach( n -> {
            if (n%2==0)
                System.out.print(n+" ");
        });
    }
}
