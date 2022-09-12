package com.zahid.lambdafilter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductTest {
    public static void main(String[] args) {
        List<Product> items = new ArrayList<>();
        items.add(new Product(1,"Iphone", 17000f));
        items.add(new Product(2,"Samsung", 15000f));
        items.add(new Product(3,"Nokia", 12000f));
        items.add(new Product(4,"Balckberry", 18000f));
        items.add(new Product(5,"Mi", 21000f));

        Stream<Product> filtered_items = items.stream().filter(p -> p.price >16000f);

        filtered_items.forEach(item -> {
            System.out.println(item.id+" "+item.name+" "+item.price);
        });
    }
}
