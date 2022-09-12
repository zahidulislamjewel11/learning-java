package com.zahid.abstractclass2;
public class Lion extends Animal {
    public Lion(int legs) {
        super(legs);
    }

    @Override
    public String getDiets() {
        return "Meat";
    }
}
