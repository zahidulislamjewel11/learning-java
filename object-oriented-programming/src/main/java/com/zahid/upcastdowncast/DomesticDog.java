package com.zahid.upcastdowncast;
public class DomesticDog extends Dog {
    @Override
    public String getType() {
        System.out.println("Domestic Dog");
        return "Domestic Dog";
    }
}
