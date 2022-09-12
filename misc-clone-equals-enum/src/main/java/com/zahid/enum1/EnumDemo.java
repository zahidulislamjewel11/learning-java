package com.zahid.enum1;

public class EnumDemo {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season.ordinal());
            // System.out.println(season);
        }
    }
}
