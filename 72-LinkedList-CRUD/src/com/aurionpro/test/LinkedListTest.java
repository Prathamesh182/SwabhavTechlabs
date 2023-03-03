package com.aurionpro.test;



import com.aurionpro.model.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();

		link.insertFirst(10);
		link.insertFirst(20);
		link.insertFirst(30);
		link.insertLast(40);
		link.insertLast(50);
		link.insert(100, 0);
		link.insert(60, 5);

		System.out.println("Displaying Linked List");
		link.display();

		System.out.println("\nDeleted First Elemennt in the List : " + link.deleteFirst());
		System.out.println("Displaying Linked List");
		link.display();

		System.out.println("\nDeleted Last Item : " + link.deleteLast());
		System.out.println("Displaying Linked List");
		link.display();

		System.out.println("\nInserting New Element at Head : ");
		link.insertFirst(101);
		System.out.println("Displaying Linked List");
		link.display();

		System.out.println("\nDeleting Element at 2nd position of the List : " + link.delete(2));
		System.out.println("Displaying Linked List");
		link.display();

		System.out.println();
		link.search(60);
		
		

	
	}
}
