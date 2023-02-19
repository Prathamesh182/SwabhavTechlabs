package com.aurionpro.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueTest {

	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<>();

		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		deque.add(50);
		System.out.println("The Deque: " + deque);

		// Adding The elements at head and tail
		deque.addFirst(89);
		deque.addFirst(69);
		deque.addLast(27);
		deque.addLast(50);
		
		System.out.println("\nThe Deque after adding Head and Tail: " + deque);
		System.out.println("The Head of this Deque is: "+deque.peek());
		System.out.println("The Tail of this Deque Which will be removed is: "+deque.pollLast());

		System.out.println("\nThe Deque Values: ");
		for (Integer x : deque) {
			System.out.println(x);
		}

	}

}
