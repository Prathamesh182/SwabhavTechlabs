package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
	
		List<String> names = new ArrayList<>();
		names.add("Karan");
		names.add("Arjun");
		names.add("Ajay");
		System.out.println(names);

		// insert element at specified position
		names.add(1, "Rajesh");
		System.out.println(names);

		// get specific element by index(index starts from 0)
		String str = names.get(2);
		System.out.println(str);

		// find out number of elements in the list
		int size = names.size();
		System.out.println("Size: " + size);

		// remove by index
		names.remove(0);
		System.out.println(names);

		// remove by value
		names.remove("Ajay");
		System.out.println(names);

		// find index of specific element
		int index = names.indexOf("Rajesh");
		System.out.println(index);

		// check if list contains specified element
		boolean isThere = names.contains("Ajay");
		System.out.println(isThere);
	}
}
