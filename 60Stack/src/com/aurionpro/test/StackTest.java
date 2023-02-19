package com.aurionpro.test;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();

		stack.push("Ganesh");
		stack.add("Krishna");
		stack.add("Bhrama");
		stack.push("Indra");
		stack.add("Vishnu");
		stack.add("Mahesh");
		stack.add("Shankar");

		System.out.println("The Stack is: " + stack);
		stack.pop();
		System.out.println("\nThe Stack after pop is:" + stack);
	}

}
