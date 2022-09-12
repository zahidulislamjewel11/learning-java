package com.zahid.clonedeep;

import com.zahid.clonedeep.course.Course;
import com.zahid.clonedeep.student.Student;

public class DeepCloneTest {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Course cse108 = new Course("CSE108", "Object Oriented Programming");

        Student s1 = new Student("Zahidul Islam", cse108);

        Student s2 = (Student) s1.clone();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        s1.setCourse(new Course("214","Assembly Programming Language"));
        System.out.println();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
 
    }
}
