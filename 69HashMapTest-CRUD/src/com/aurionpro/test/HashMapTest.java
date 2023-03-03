package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
	
		Map<Integer,String> names = new HashMap<>();
		names.put(1,"Karan");
		names.put(2,"Arjun");
		names.put(3,"Ajay");
		System.out.println(names);

		// insert element at specified position
		names.put(4, "Rajesh");
		System.out.println(names);

		// get specific element by index(index starts from 0)
		String str = names.get(2);
		System.out.println(str);

		// find out number of elements in the list
		int size = names.size();
		System.out.println("Size: " + size);

		// remove by index
		names.remove(4);
		System.out.println(names);

		// remove by value
		names.remove(2,"Arjun");
		System.out.println(names);

		// find index of specific element
		boolean index = names.containsValue("Rajesh");
		System.out.println(index);

		// check if list contains specified element
		boolean isThere = names.containsKey(4);
		System.out.println(isThere);
		
		// check if hashmap is empty
		boolean isEmpty = names.isEmpty();
		System.out.println(isEmpty);
	}
}
