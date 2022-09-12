package com.zahid.forest;

import com.zahid.forest.animal.Animal;
import com.zahid.forest.animal.Bird;
import com.zahid.forest.animal.Fish;

public class ForestTest {
    public static void main(String[] args) {
        new Animal("M", 2).eat();
        new Animal("M", 2).sleep();;
        new Fish("F", 1).swim();
        new Bird("F", 3, "Silver").fly();;
    }
}