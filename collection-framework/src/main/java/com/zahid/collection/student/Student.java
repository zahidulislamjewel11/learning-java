package com.zahid.collection.student;

import java.util.Comparator;

// import lombok.Data;

// @Data
public class Student implements Comparable<Student>, Comparator<Student> {
    
    private String name;
    
    public Student() {
    }
    
    public Student(String name) {
        this.name = name;
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // @Override
    // public int compareTo(Student other) {
    //     int len1 = this.name.length();
    //     int len2 = other.name.length();
    //     int lim = Math.min(len1, len2);

    //     char[] v1 = this.name.toCharArray();
    //     char[] v2 = other.name.toCharArray();
    //     int k = 0;

    //     while(k < lim) {
    //         char c1 = v1[k];
    //         char c2 = v2[k];

    //         if(c1 != c2) {
    //             return c1 - c2;
    //         }
    //         k++;
    //     }
        
    //     return len1 - len2;
    // }
    
    // for comparable interface
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }

    // for comparator interface
    @Override
    public int compare(Student s1, Student s2) {
        return s1.compareTo(s2);
    }

}
