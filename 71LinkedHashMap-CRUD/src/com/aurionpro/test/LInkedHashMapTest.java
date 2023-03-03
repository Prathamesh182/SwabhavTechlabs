package com.aurionpro.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LInkedHashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> names = new LinkedHashMap<>();
		// add elements to back of the linkedhashmap
		names.put(1, "Raju");
		names.put(2, "BabuRao");
		names.put(3, "Shyam");
		System.out.println(names);

		// insert element at specified position
		names.put(4, "Anuradha");
		System.out.println(names);

		// insert element at specified position if not present
		names.putIfAbsent(5, "Anjali");
		System.out.println(names);

		// replacing element at specified position
		names.replace(2, "Totla");
		System.out.println(names);

		// get specific element by key
		String str = names.get(2);
		System.out.println(str);

		// find out number of elements in the linkedhashmap
		int size = names.size();
		System.out.println("Size: " + size);

		// remove by key
		names.remove(3);
		System.out.println(names);

		// remove by key & value
		names.remove(2, "Totla");
		System.out.println(names);

		// check if linkedhashmap contains specified element
		boolean isThere = names.containsValue("Raju");
		System.out.println(isThere);

		// check if linkedhashmap is empty
		boolean isEmpty = names.isEmpty();
		System.out.println(isEmpty);
	}

}
