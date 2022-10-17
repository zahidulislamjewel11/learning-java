package com.zahid.collection.person;

import lombok.EqualsAndHashCode;

// import lombok.Data;

// @Data
@EqualsAndHashCode
public class Person implements Comparable<Person> {
    private String name;
    private Integer age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
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

        return this.age.compareTo(o.age); // for smaller to larger
    }
        
    // @Override
    // public int compareTo(Person o) {
        
    //     return o.age.compareTo(this.age); // for larger to smaller
    // }

    @Override
    public String toString() {
        return name + "(" + age +")";
    }

    
    /* @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((age == null) ? 0 : age.hashCode());
        return result;
    } */

    /* @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age == null) {
            if (other.age != null)
                return false;
        } else if (!age.equals(other.age))
            return false;
        return true;
    } */ 
}
