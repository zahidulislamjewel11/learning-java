package com.zahid.vector;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorList {
    public static void main(String[] args) {
//        List<String> emperors = new ArrayList<>();
        List<String> emperors = new Vector<>();

        emperors.add("Babur");
        emperors.add("Humayun");
        emperors.add("Akbar");
        emperors.add("Jahangir");
        emperors.add("Shah Jahan");
        emperors.add("Aurangzeb");

        System.out.println("Name of the emperors: ");
        for(String emp:emperors) {
            System.out.println(emp);
        }

        System.out.println("Name of the emperors: " + emperors);
        System.out.println("Total emperors: " + emperors.size());

        System.out.println("First emperor: " + emperors.get(0));
        System.out.println("Second emperor: " + emperors.get(1));

        emperors.remove(3);
        System.out.println("Remaining emperors: " + emperors);
        System.out.println("Position of Babar: " + emperors.indexOf("Babur"));
        System.out.println("Position of Humayun: " + emperors.indexOf("Humayun"));
        System.out.println("Position of Akbar: " + emperors.indexOf("Akbar"));
        System.out.println("Position of Bahadur Shah: " + emperors.indexOf("Bahadur Shah"));
    }
}
