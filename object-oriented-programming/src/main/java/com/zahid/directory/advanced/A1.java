package com.zahid.directory.advanced;

import com.zahid.directory.basic.B1;

/**
 * A1
 */
public class A1 {

    public A1() {
        System.out.println("Package Name: com.zahid.advanced");
        System.out.println("A1 Created");
    }

    public void callingB1() {
        System.out.println("Creating B1 from A1");
        new B1();
    }
}