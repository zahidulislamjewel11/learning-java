package com.zahid.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.zahid.collection.student.Student;

public class ArraySortExample {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();

        for(int i=0; i<array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
        List<Integer> newArrayList = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(newArrayList);
        System.out.println(newArrayList);
        System.out.println();

        char[] charArray = new char[10];

        for(int i=0; i<charArray.length; i++) {
            // charArray[i] = (char)(random.nextInt(26) + 65);
            charArray[i] = (char)(random.nextInt(26) + 97);
        }
        System.out.println(Arrays.toString(charArray));
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));

        Student[] studentList = new Student[]{
            new Student("Alex"),
            new Student("Lee"),
            new Student("Cooper"),
            new Student("John"),
            new Student("Doe"),
            new Student("Jim"),
            new Student("Attenborough"),
        };
        System.out.println(Arrays.toString(studentList));
        
        Arrays.sort(studentList);
        System.out.println(Arrays.toString(studentList));

        // using anonymous inner class & comparator
        Arrays.sort(studentList, new Comparator<Student>(){
            @Override 
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName()); // lexicographically
            }
        });
        System.out.println(Arrays.toString(studentList));

        Arrays.sort(studentList, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().length() - s2.getName().length();
            }
            
        });
        System.out.println(Arrays.toString(studentList));

        Arrays.sort(studentList, (s1,s2) -> s1.compareTo(s2)); // using lambda
        System.out.println(Arrays.toString(studentList));

        Arrays.sort(studentList, (s1,s2) -> s1.getName().length() - s2.getName().length()); // using lambda
        System.out.println(Arrays.toString(studentList));

    }
}
