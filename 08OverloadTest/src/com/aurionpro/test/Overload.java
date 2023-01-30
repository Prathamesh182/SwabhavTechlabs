package com.aurionpro.test;

public class Overload {

	public static void main(String[] args) {
		printInfo(10);
		printInfo("Dombivli");
		printInfo(1<2);
		printInfo(0.0);
	}

	private static void printInfo(double d) {
		System.out.println(d);
	}

	private static void printInfo(boolean b) {
		System.out.println(b);
	}

	private static void printInfo(String string) {
		System.out.println(string);
	}

	private static void printInfo(int i) {
		System.out.println(i);
	}

}
