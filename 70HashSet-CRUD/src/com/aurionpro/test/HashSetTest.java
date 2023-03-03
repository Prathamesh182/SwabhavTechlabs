package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
			Set<String> names = new HashSet<String>();
			names.add("Arjun");
			names.add("Karan");
			names.add("Jayesh");
			System.out.println(names);

			// find out number of elements in the hashset
			int size = names.size();
			System.out.println("Size: " + size);

			// remove by value
			names.remove("Jayesh");
			System.out.println(names);

			// check if hashset contains specified element
			boolean isThere = names.contains("Arjun");
			System.out.println(isThere);

			// check if hashset is empty
			boolean isEmpty = names.isEmpty();
			System.out.println(isEmpty);
	}

}
