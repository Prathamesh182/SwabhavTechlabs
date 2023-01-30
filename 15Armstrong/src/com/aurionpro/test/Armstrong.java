package com.aurionpro.test;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n = 0, temp = 0, rem, r = 0;
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		temp=n;
		while (temp != 0) {

			rem = temp % 10;
			r += Math.pow(rem, 4);
			temp /= 10;
		}

		/*
		 * for (temp = n; temp != 0; temp /= 10) { rem = temp % 10; r += Math.pow(rem,
		 * 4);
		 * 
		 * }
		 */

		if (r == n) { 
			System.out.println(n + " is an Armstrong number.");}
		else {
			System.out.println(n + " is not an Armstrong number.");
		}
}
}