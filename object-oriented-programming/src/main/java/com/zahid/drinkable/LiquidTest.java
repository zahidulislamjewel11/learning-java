package com.zahid.drinkable;

import com.zahid.drinkable.liquid.beverage.Coffee;
import com.zahid.drinkable.liquid.beverage.Juice;
import com.zahid.drinkable.liquid.beverage.Milk;
import com.zahid.drinkable.liquid.beverage.Tea;
import com.zahid.drinkable.liquid.drinks.Beer;
import com.zahid.drinkable.liquid.drinks.Wine;
import com.zahid.drinkable.liquid.others.Water;


public class LiquidTest {
    public static void main(String[] args) {
        new Coffee();
        new Juice();
        new Milk();
        new Tea();

        new Beer();
        new Wine();

        new Water();

        System.out.println();
        System.out.println();
        System.out.println(new Water());
        System.out.println(new Water().getClass());
        System.out.println(new Water().getClass().getName());
        System.out.println(new Water().getClass().getSimpleName());
        System.out.println(new Water().getClass().getTypeName());
        System.out.println(new Water().getClass().getSuperclass().getTypeName());
    }
}
