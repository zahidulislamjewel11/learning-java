package com.zahid.lombok;

import com.zahid.lombok.student.Student;


public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student("S200905081", "Zahidul Islam", "CSE");
        Student s2 = new Student("S200904045", "Pias Das", "ME");


        System.out.println(s1);
        System.out.println(s2);
        
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getDept());
    }
}