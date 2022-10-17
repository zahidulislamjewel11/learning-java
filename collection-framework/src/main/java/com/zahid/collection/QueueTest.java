package com.zahid.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(); // double ended queue

        queue.offer(2);
        queue.offer(3);
        queue.offer(5);
        queue.offer(7);
        queue.offer(11);

        System.out.println(queue);

        for(int i=0; i<queue.size(); i++) {
            System.out.println(queue.peek());
            queue.poll();
        }

        System.out.println(queue.size());
    }
}
