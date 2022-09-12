package com.zahid.stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> numbers = new Stack<Integer>();
		numbers.push(4);
		numbers.push(9);
		numbers.push(2);
		numbers.push(3);
		numbers.push(5);
		System.out.println(numbers);
		System.out.println(numbers.pop());
		System.out.println(numbers.pop());
		System.out.println(numbers.peek());
		System.out.println(numbers);
		
		Stack<Character> tower = new Stack<Character>();
		tower.push('R');
		tower.push('B');
		tower.push('Y');
		System.out.println(tower);
		System.out.println(tower.peek());
		System.out.println(tower.pop());
		System.out.println(tower.pop());
		System.out.println(tower);
		System.out.println(tower.size());
		System.out.println(tower.empty());
		System.out.println(tower.get(0));
	}

}
