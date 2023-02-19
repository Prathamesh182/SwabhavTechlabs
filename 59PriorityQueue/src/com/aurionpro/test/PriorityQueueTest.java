package com.aurionpro.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();

		queue.add("Arjun");
		queue.add("Ram");
		queue.add("Hanuman");
		queue.add("Laxman");
		queue.add("Raavan");
		queue.add("Sita");

		System.out.println("The Queue is: " + queue);

		System.out.println("\nThe size of the queue is: " + queue.size());
		System.out.println("The head of the queue is: " + queue.peek());
		System.out.println("The Head of the queue which will be removed from the queue is: " + queue.poll());
		System.out.println("Queue After removing the head is:" + queue);

		System.out.println();
		System.out.println("The Elements of Queue: ");
		for (String x : queue) {
			System.out.println(x);
		}

	}

}
