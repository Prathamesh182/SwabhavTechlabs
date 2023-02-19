package com.aurionpro.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();

		set.add("Buddha");
		set.add("Jesus");
		set.add("Allah");
		set.add("Ganpati");

		System.out.println("The Set Contains: " +set);
		System.out.println("\nThe set Contain the value: " + set.contains("Jesus"));
		
		System.out.println("\nThe Element with first alphabet : "+set.first());
		System.out.println("\nThe Element at the head that will be removed is: "+set.pollFirst());
		System.out.println("The set after poll first: "+set);
		System.out.println("\nThe Element at the with last alphabet order will be: "+set.pollLast());
		System.out.println("The set after poll last: "+set);
		System.out.println("The Element Remained in set : "+set);
		System.out.println("\nThe Element remained with last Alphabet: "+set.last());
		
		System.out.println("\nThe Set :");
		for(String x:set) {
			System.out.println(x);
		}
		
		
	}

}

