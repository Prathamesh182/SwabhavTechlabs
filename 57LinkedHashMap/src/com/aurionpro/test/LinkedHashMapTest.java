package com.aurionpro.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();

		map.put("Ajay", 1);
		map.put("Vijay", 2);
		map.put("Sujay", 3);
		map.put("DigVijay", 3);
		map.put("RanVijay", 4);

		System.out.println( "The Map : "+map);
		System.out.println("\nThe Map Contains values: ");

		// Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("\nThe Map Returns Values in set :");
		System.out.println(map.entrySet());
	}

}
