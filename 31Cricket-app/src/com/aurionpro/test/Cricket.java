package com.aurionpro.test;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		System.out.println("Enter 1 to Start the Game & 0 for Exit");
		Scanner sc = new Scanner(System.in);
		int Choice = sc.nextInt();
		if (Choice == 1) {

			System.out.println("Enter Player 1 Name:");
			String Choice2 = sc.next();
			if (Choice2.equalsIgnoreCase("Ram")) 
			{
				System.out.println("Enter Player 2 Name: ");
			}

		}

		else {
			System.out.println("You Exited the Game");
		}
	}

}
