package com.zahid.multipleinterface;
public class InheritingClass implements InterfaceOne, InterfaceTwo {
    @Override
    public void sayHello() {
        System.out.println("Hello, there");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Farewell my dear");
    }
}
