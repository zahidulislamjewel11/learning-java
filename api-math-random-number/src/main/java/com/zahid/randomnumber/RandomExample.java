package com.zahid.randomnumber;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        Random random = new Random();
        int aRandomNumber = random.nextInt();
        System.out.println(aRandomNumber);

        int min = 10;
        int max = 20;
        // int anotherRandomNumber = random.nextInt(max - min + 1);
        int anotherRandomNumber = random.nextInt(max - min + 1) + min;
        System.out.println(anotherRandomNumber);

        int finalRandomNumber = random.nextInt(100);
        System.out.println(finalRandomNumber);

    }
}