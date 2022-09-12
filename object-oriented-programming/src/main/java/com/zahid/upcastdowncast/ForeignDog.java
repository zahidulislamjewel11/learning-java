package com.zahid.upcastdowncast;
public class ForeignDog extends Dog {
    @Override
    public String getType() {
        System.out.println("Foreign Dog");
        return "Foreign Dog";
    }

    public String getName()
    {
        return "Kodi";
    }
}
