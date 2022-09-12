package com.zahid.directory;

import com.zahid.directory.advanced.*;
import com.zahid.directory.basic.B1;

public class DirectoryTest {
    public static void main(String[] args) {
        new A1();
        new A1().callingB1();;
        new A2();
        new B1();
        new B1();
    }
}
