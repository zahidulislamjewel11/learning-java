package com.zahid.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.zahid.collection.student.Student;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Alex"));
        studentList.add(new Student("Lee"));
        studentList.add(new Student("Cooper"));
        studentList.add(new Student("John"));
        studentList.add(new Student("Doe"));
        studentList.add(new Student("Jane"));
        studentList.add(new Student("David"));
        studentList.add(new Student("Attenborough"));

        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println(studentList);

        // int index = Collections.binarySearch(studentList, new Student("Alex"));
        int index = Collections.binarySearch(studentList, new Student("David"));

        if(index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
        System.out.println();

        // for primitive type array
        int[] numList = new int[]{4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
        System.out.println(Arrays.toString(numList));
        Arrays.sort(numList);
        System.out.println(Arrays.toString(numList));

        int key = 6;
        int position = Arrays.binarySearch(numList, key);

        if(position != -1) {
            System.out.println("Found at index "+position);
        } else {
            System.out.println("Not found");
        }
    }
}
