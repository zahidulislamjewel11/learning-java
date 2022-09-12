package com.zahid.hashcode;

import com.zahid.hashcode.employee.Employee;

public class HashCodeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Zahidul", "Islam");
        Employee emp2 = new Employee("Tonmoy", "Hasan");
        Employee emp3 = new Employee("Zahidul", "Islam");

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp3.hashCode());

        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp3));
    }
}
