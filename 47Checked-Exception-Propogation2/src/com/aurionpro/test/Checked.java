package com.aurionpro.test;

public class Checked {

	public static void main(String[] args) {
		method1();
		System.out.println("main");
	}

	private static void method1() {
		try {
			method2();
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("method1");

	}

	private static void method2() throws Exception {
		method3();
		System.out.println("method2");
	}

	private static void method3() throws Exception {
		throw new Exception("an exception occured");
	}

}
