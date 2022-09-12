package com.zahid.lambdasort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductTest {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "Processor", 20000));
        list.add(new Product(2, "Mother Board", 8000));
        list.add(new Product(3, "RAM", 5000));
        list.add(new Product(4, "SSD", 10000));
        list.add(new Product(5, "Power Supply", 6000));

        // list.forEach( item -> System.out.println(item));
        list.forEach( item -> System.out.println(item.id+". "+item.name+" "+ item.price+" Taka"));
        System.out.println();

        // after sorting by name
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for(Product p:list) {
            System.out.println(p.id+". "+p.name+" "+ p.price+" Taka");
        }
    }
}
