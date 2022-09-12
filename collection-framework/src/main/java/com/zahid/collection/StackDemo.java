package com.zahid.collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stackList = new Stack<>();

        stackList.push(2);
        stackList.push(3);
        stackList.push(5);
        stackList.push(7);
        stackList.push(11);

        System.out.println(stackList);
        // System.out.println(stackList.size());

        for(int i=0; i<stackList.size(); i++) {
            System.out.println(stackList.peek());
            stackList.pop();
        }

        System.out.println(stackList.size());
    }
}
