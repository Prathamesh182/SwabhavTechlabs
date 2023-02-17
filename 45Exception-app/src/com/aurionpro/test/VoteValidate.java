package com.aurionpro.test;

import java.util.Scanner;

public class VoteValidate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age =sc.nextInt();
		try {
			validateUserAge(age);
		} catch(InvalidAgeException e) {
			System.out.println(e);
		}
		System.out.println("End of Code.....");
	}

	private static void validateUserAge(int age) throws InvalidAgeException {
		if(age>=18) {
			System.out.println("valid");
		}
		else {
			throw new InvalidAgeException("Under Age");
		}
	}

}
