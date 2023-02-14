package com.aurionpro.test;

import java.util.Scanner;

public class VoteValidate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age =sc.nextInt();
		validateUserAge(age);
	}

	private static void validateUserAge(int age) {
		if(age>=18) {
			System.out.println("valid");
		}
		else {
			throw new RuntimeException("Under Age");
		}
	}

}
