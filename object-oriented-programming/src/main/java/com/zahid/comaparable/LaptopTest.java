package com.zahid.comaparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopTest {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell", 16, 800));
        laptops.add(new Laptop("Asus", 32, 1000));
        laptops.add(new Laptop("Lenovo", 8, 600));
        laptops.add(new Laptop("Macbook", 8, 1100));
        laptops.add(new Laptop("HP", 16, 700));

//        System.out.println(laptops);
        System.out.println("Before Sorting:");
        laptops.forEach(laptop -> {
            System.out.println(laptop);
        });
        System.out.println();

        Collections.sort(laptops);
        
        System.out.println("After Sorting by Price:");
        for(Laptop laptop:laptops) {
            System.out.println(laptop);
        }


    }
}
