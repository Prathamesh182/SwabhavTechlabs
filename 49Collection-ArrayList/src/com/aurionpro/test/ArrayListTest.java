package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(20);
		list.add(10);
		System.out.println(list.size());
		System.out.println(list);

//		for(Integer i:list) {
//			System.out.println(i);
//		}
//		list.forEach(System.out::println);
//		
//		for(int i = 0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(list.contains(10));
		
		list.remove(0);
		list.remove(new Integer(20));
		System.out.println(list);
		
	}
}
