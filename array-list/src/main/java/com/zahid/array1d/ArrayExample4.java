package com.zahid.array1d;
public class ArrayExample4 {
    public static void main(String[] args) {
//        String names[] = {"Zahid", "Jewel", "Tonmoy", "Robi"};
//        String[] names = {"Zahid", "Jewel", "Tonmoy", "Robi"};
//        String names[] = new String[4];
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

    }
}
