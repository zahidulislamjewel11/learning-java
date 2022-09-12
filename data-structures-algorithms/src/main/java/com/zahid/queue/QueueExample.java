package com.zahid.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> line = new LinkedList<String>();
		line.add("Jewel");
		line.add("Zahid");
		line.add("Dhrubo");
		
		System.out.println(line);
		System.out.println(line.poll());
		System.out.println(line);
		System.out.println(line.poll());
		System.out.println(line);
		System.out.println(line.peek());
		System.out.println(line);
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(4);
		q.add(9);
		q.add(2);
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.contains(4));
		System.out.println(q.contains(9));
		System.out.println(q.toArray());
		System.out.println(q.toArray()[1]);
	}

}
