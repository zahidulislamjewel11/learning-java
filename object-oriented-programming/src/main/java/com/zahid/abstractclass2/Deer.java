package com.zahid.abstractclass2;
public class Deer extends Animal {
    @Override
    public String getDiets() {
        return "Grass";
    }

    public Deer(int legs) {
        super(legs);

    }
}
