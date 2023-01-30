package com.aurionpro.test;

import java.util.Scanner;

public class Ride {

	public static void main(String[] args) {
		System.out.println("Welcome to the Wonder ride...");
		Scanner sc = new Scanner(System.in);
		int entryfees = 0, total = 0;
		System.out.println("Enter yor height :");
		int height = sc.nextInt();
		if (height >= 120) {
			System.out.println("Can go to the Ride");
			System.out.println("Enter your age!!!");
			int age = sc.nextInt();
			if (age < 12) {
				entryfees = 5;
				System.out.println("Ride cost 5$");

			} else if (age >= 12 && age < 18) {
				entryfees = 7;
				System.out.println("Ride cost 7$");
			} else if (age >= 18 && age < 45) {
				entryfees = 12;
				System.out.println("Ride cost 12$");

			} else if (age >= 45 && age < 55) {
				entryfees = 3;
				System.out.println("Ride cost 3$");

			} else {
				System.out.println("Its free Ride");
			}
			System.out.println("Enter yes for photos : 3$ will be charged :");
			String photos = sc.next();
			
			if (photos.equalsIgnoreCase("yes")) {
				total = entryfees+3;
			} else {
				total = entryfees;
			}
			System.out.println("Total fare for ride :$"+total);

		} else {
			System.out.println("Cannot go for the ride");
		}
	}
}
