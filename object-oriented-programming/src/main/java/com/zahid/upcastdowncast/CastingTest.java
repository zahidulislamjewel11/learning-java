package com.zahid.upcastdowncast;

public class CastingTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new DomesticDog();
        Dog dog3 = new ForeignDog();

        dog1.getType();
        dog2.getType();
        dog3.getType();

//        ForeignDog fd = (ForeignDog) dog3;
//        fd.getName();

        ((ForeignDog) dog3).getName();

        if(dog3 instanceof ForeignDog)
        {
            ForeignDog fd = (ForeignDog) dog3;
            fd.getName();
        }
    }
}
