package com.zahid.cloneshallow;

import com.zahid.cloneshallow.course.Course;
import com.zahid.cloneshallow.student.Student;

public class ShallowCloneTest {
    
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

        s1.setCourse(new Course("CSE308","Software Engineering"));
        System.out.println();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
 
    }
}
