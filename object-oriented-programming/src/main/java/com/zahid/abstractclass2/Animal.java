package com.zahid.abstractclass2;
public abstract class Animal {
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void sleep()
    {
        String name = getClass().getSimpleName();
        System.out.println(name+" sleeping..don't disturb!");
    }

    public abstract String getDiets();
}
