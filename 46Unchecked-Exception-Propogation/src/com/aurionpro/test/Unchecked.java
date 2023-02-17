package com.aurionpro.test;

public class Unchecked {

	public static void main(String[] args) {
		method1();
		System.out.println("main");
	}

	private static void method1() {
		try {
			method2();
		} 
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("method1");

	}

	private static void method2() {
		method3();
		System.out.println("method2");
	}

	private static void method3() {
		throw new RuntimeException("an exception occured");
	}

}
