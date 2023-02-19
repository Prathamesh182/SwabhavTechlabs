package com.aurionpro.test;

import java.util.HashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new LinkedHashSet<>();

		set.add("Arjuna");
		set.add("Bhima");
		set.add("Nakul");
		set.add("Sahadev");
		set.add("Dharmaraj");

		System.out.println("Size is: " + set.size());
		System.out.println("Is set Empty: " + set.isEmpty());
		System.out.println("Set Contains Values: " + set.toString());

		System.out.println("\nThe Set: ");
		for (String x : set) {
			// System.out.println(x.replace('S', 'M'));
			System.out.println(x.toUpperCase());
		}

	}

}
