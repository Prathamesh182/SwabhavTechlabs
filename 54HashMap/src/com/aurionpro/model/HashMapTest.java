package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Prathamesh");
		map.put(2, "Jay");
		map.put(3, "Sujay");
		map.put(4, "Vijay");
		// map.put(1, "Ajay");
		System.out.println(map);
		// Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println("USING ENHANCED FOR");
		for (Entry<Integer, String> x : map.entrySet()) {
			System.out.println(x.getKey() + " : " + x.getValue());

		}
		System.out.println("USING FOR EACH");
		map.forEach((key, value) -> System.out.println(key + " : " + value));
//		map.remove(1);
//		System.out.println(map);
//		
		// map.containsValue("Prathamesh");
		// System.out.println(map);

		// System.out.println(map);

		int Ikey = 0;
		for (Entry<Integer, String> x : map.entrySet()) {
			if (x.getValue().equals("Prathamesh")) {
				Ikey = x.getKey();

			}

			// System.out.println(Ikey);
		}
		map.remove(Ikey);
		System.out.println(map	);
		

	}

}
