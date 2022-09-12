package com.zahid.collection.person;

// import lombok.Data;

// @Data
public class Person implements Comparable<Person> {
    private String name;
    private Integer age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // @Override
    // public int compareTo(Person o) {

    //     return this.age.compareTo(o.age);
    // }
        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        
        return o.age.compareTo(this.age);
    }

    @Override
    public String toString() {
        return name + "(" + age +")";
    } 

    
}
