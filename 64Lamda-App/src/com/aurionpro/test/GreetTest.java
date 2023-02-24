package com.aurionpro.test;

import com.aurionpro.model.IGreetable;
import com.aurionpro.model.addIntegers;

public class GreetTest {

	public static void main(String[] args) {
//		addIntegers hello = new addIntegers();
//		hello.greet("Abhi");	
//		System.out.println(hello);
//	}

//		IGreetable obj = new IGreetable() {
//
//			@Override
//			public void greet(String name) {
//				System.out.println("Good EVeneing " + name);
//				
//			}
//
//		};
//		obj.greet("Abhi");
//		
//		IGreetable obj2 = (name)->System.out.println("Welcome");
//		obj2.greet("Abhi");
//		obj.greet("Welcome");

		IGreetable obj = (name) -> System.out.println("hi " + name);
		obj.greet("Raj");

		IGreetable obj2 = GreetTest::welcome;
		obj2.greet("Abhi");

		GreetTest greet = new GreetTest();
		IGreetable obj3 = greet::hello;
		obj3.greet("PB");

	}

	public static void welcome(String name) {
		System.out.println("Hello " + name);
	}

	public void hello(String name) {
		System.out.println("hey " + name);
	}

}
