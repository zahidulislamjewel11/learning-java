package com.zahid.lombok.student;

import lombok.Data;

@Data
public class Student {
    
    private String id;
    private String name;
    private String dept;
    
    public Student(String id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    
}
