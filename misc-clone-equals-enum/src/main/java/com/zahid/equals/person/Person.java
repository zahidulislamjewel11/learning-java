package com.zahid.equals.person;

/**
 * Person
 */
public class Person implements Cloneable {

    private String firstName;
    private String lastName;

    public Person(Person person) {
        this.firstName = person.firstName;
        this.lastName = person.lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj == null) {
            return false;
        }

        if(this.getClass() != obj.getClass()) {
            return false;
        }

        Person person = (Person) obj;

        if(this.firstName != null) {
            if(!this.firstName.equals(person.firstName)) {
                return false;
            } else {
                if(person.firstName != null) {
                    return false;
                }
            }
        }

        if(this.lastName != null) {
            return this.lastName.equals(person.lastName);
        } else {
            return person.lastName == null;
        }
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName;
    }

    
}