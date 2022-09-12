package com.zahid.abstractclass2;
public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] =  new Lion(4);
        animals[1] =  new Tiger(4);
        animals[2] =  new Deer(4);

        MiniZoo mz = new MiniZoo(animals);
        mz.putThemOnSleep();
        System.out.println();
        mz.printDietsOfAllAnimal();
    }
}
