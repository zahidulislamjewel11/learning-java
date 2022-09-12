package com.zahid.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopTest {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell", 16, 800));
        laptops.add(new Laptop("Asus", 32, 1000));
        laptops.add(new Laptop("Lenovo", 8, 600));
        laptops.add(new Laptop("MacBook", 8, 1100));
        laptops.add(new Laptop("HP", 16, 700));
        laptops.add(new Laptop("SurfaceBook", 4, 900));

//        System.out.println(laptops);
        System.out.println("Before Sorting:");
        laptops.forEach(laptop -> {
            System.out.println(laptop);
        });
        System.out.println();
        /*
        Comparator<Laptop> com = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop L1, Laptop L2) {
                if(L1.getRam()> L2.getRam())
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(laptops, com);
        */

        Collections.sort(laptops, (Laptop L1, Laptop L2) -> {
            return L1.getRam()>L2.getRam()?1:-1;
        });

        System.out.println("After Sorting by ram:");
        for(Laptop laptop:laptops) {
            System.out.println(laptop);
        }


    }
}
