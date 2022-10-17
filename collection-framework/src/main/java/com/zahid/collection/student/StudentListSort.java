package com.zahid.collection.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentListSort {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Zahid"));
        studentList.add(new Student("Jewel"));
        studentList.add(new Student("Islam"));
        studentList.add(new Student("Tonmoy"));
        studentList.add(new Student("Hasan"));
        studentList.add(new Student("Robi"));

        System.out.println(studentList);

        // Collections.sort(studentList);

        // using anynmous inner class
        Collections.sort(studentList, new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
            
        });
        System.out.println(studentList);

        // using lambda function
        Collections.sort(studentList, (s1, s2) -> s1.getName().compareTo(s2.getName())); // lexicographically
        System.out.println(studentList);

        Collections.sort(studentList, (s1, s2) -> s1.getName().length() - s2.getName().length()); // by length
        System.out.println(studentList);
        
    }
}
