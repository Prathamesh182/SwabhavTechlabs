package com.aurionpro.test;

import java.util.Scanner;

public class SinglyLinkedList {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void input() {
		int data, n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the data");
			data = sc.nextInt();
			Node node = new Node(data);
			if (head == null) {
				head = node;
			} else {
				node.next = head;
				head = node;
			}
			System.out.println("Do you want to add more data,if yes press:1");
			n = sc.nextInt();
		} while (n == 1);
	}

	public void Display() {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked List Does not exist");
		} else {
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public void Search(int data) {
		Node current = head;
		int i = 1;
		boolean check = false;
		if (head == null) {
			System.out.println("linked list is not present");
		} else {
			while (current != null) {
				if (current.data == data) {
					check = true;
					break;

				}
				i++;
				current = current.next;
				if (check) {
					System.out.println("Element is present in:" + i);
				} else {
					System.out.println("Element is not present there");
				}
			}
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList slist = new SinglyLinkedList();
		slist.input();
		slist.Display();
		slist.Search(20);
	}
}
