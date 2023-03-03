package com.aurionpro.test;


import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();

		// add elements to back of the treeset
		names.add("Raju");
		names.add("Nanji Bhai");
		names.add("Kachara Shet");
		names.add("Pappu");
		names.add("Kabira");
		names.add("Tiwari");
		System.out.println(names);

		// find out number of elements in the treeset
		int size = names.size();
		System.out.println("Size: " + size);

		// find out first element in the treeset
		String first = names.first();
		System.out.println(first);

		// find out last element in the treeset
		String last = names.last();
		System.out.println(last);

		// remove by value
		names.remove("Kabira");
		System.out.println(names);

		// removing out first element in the treeset
		String firstPoll = names.pollFirst();
		System.out.println(firstPoll);

		// removing out last element in the treeset
		String lastPoll = names.pollLast();
		System.out.println(lastPoll);

		// check if treeset contains specified element
		boolean isThere = names.contains("Raju");
		System.out.println(isThere);

		// check if treeset is empty
		boolean isEmpty = names.isEmpty();
		System.out.println(isEmpty);
	}

}
