package com.zahid.cloneshallow.student;

import com.zahid.cloneshallow.course.Course;

public class Student implements Cloneable {

    private String studentName;
    private Course course;

    public Student() {
    }

    
    public Student(String studentName) {
        this.studentName = studentName;
    }


    public Student(String studentName, Course course) {
        this.studentName = studentName;
        this.course = course;
    }


    public String getStudentName() {
        return studentName;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public Course getCourse() {
        return course;
    }


    public void setCourse(Course course) {
        this.course = course;
    }

    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return studentName + "[" + course + "]";
    } 
    
}
