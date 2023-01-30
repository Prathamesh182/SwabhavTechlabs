package com.aurionpro.test;

import java.util.*;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		boolean isPrime = true;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				System.out.println("notPrime");
				break;

			}

		}
		if (isPrime == true) {
			System.out.println("Its Prime");

		} 

	}
}
