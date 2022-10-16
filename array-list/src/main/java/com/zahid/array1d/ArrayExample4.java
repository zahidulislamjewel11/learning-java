package com.zahid.array1d;

import java.util.LinkedList;
import java.util.List;

public class ArrayExample4 {
    public static void main(String[] args) {
        // String names[] = {"Zahid", "Jewel", "Tonmoy", "Robi"};
        // String[] names = {"Zahid", "Jewel", "Tonmoy", "Robi"};
        // String names[] = new String[4];
        String[] names = new String[4];

        names[0]="Zahid";
        names[1]="Jewel";
        names[2]="Tonmoy";
        names[3]="Robi";

        int length = names.length;
        System.out.printf("Array length = %d\n", length);

        for(String name:names)
        {
            System.out.printf("%s\n", name);
        }
        System.out.println();

        List<String> languages = new LinkedList<>();

        languages.add("C");
        languages.add("C++");
        languages.add("Java");
        languages.add("Python");
        languages.add("JS");
        languages.add("C#");
        languages.add("Bash");
        languages.add("Assembly");
        languages.add("PHP");

        for (String lang : languages) {
            System.out.println(lang);
        }
        System.out.println();

        languages.forEach(lang -> System.out.println(lang));
        System.out.println();
        languages.forEach(System.out::println);

    }
}
