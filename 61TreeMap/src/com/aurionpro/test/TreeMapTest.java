package com.aurionpro.test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Map<String, Character> map = new TreeMap<>();

		map.put("Akash ", 'A');
		map.put("Balram ", 'B');
		map.put("Chotu ", 'C');
		map.put("Daulat ", 'D');

		System.out.println("The Map: " + map);

		System.out.println("\nThe map contains the name Akash in it: " + map.containsKey("Akash"));
		System.out.println("The map contains the Code A in it: " + map.containsValue('A'));

		System.out.println("\nThe Map Contains: ");
		// Set<Entry<String, Character>> entrySet = map.entrySet();
		for (Map.Entry<String, Character> e : map.entrySet()) {
			System.out.println(e.getKey() + " --> " + e.getValue());
		}
		System.out.println("\nThe Values in set: ");
		System.out.println(map.entrySet());
	}

}
