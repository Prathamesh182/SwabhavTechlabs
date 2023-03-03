package com.aurionpro.test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<Integer, String> names = new TreeMap<>();

		// add elements to back of the treemap
		names.put(1, "Akshay");
		names.put(2, "Paresh");
		names.put(3, "Sunil");
		System.out.println(names);

		// insert element at specified position
		names.put(4, "Rajpal");
		System.out.println(names);

		// replacing element at specified position
		names.replace(2, "Johnny");
		System.out.println(names);

		// get specific element by key
		String str = names.get(2);
		System.out.println(str);

		// find out number of elements in the treemap
		int size = names.size();
		System.out.println("Size: " + size);

		// remove by key
		names.remove(3);
		System.out.println(names);

		// remove by key & value
		names.remove(2, "Johnny");
		System.out.println(names);

		// check if treemap contains specified element
		boolean isThere = names.containsValue("Akshay");
		System.out.println(isThere);

		// check if treemap is empty
		boolean isEmpty = names.isEmpty();
		System.out.println(isEmpty);
	}

}
