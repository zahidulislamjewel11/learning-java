package com.zahid.clonedeep.student;

import com.zahid.clonedeep.course.Course;

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
        Course clonedCourse = (Course) this.course.clone();
        Student clonedStudent = (Student) super.clone();
        clonedStudent.setCourse(clonedCourse);

        return clonedStudent;
    }

    @Override
    public String toString() {
        return studentName + "[" + course + "]";
    } 
    
}
