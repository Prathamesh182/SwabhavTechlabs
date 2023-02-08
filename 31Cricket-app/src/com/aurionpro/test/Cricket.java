package com.aurionpro.test;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
		int min = 1, max = 300;
		System.out.println("Enter 1 to Start the Game & 0 for Exit");
		Scanner sc = new Scanner(System.in);
		int Choice = sc.nextInt();
		if (Choice == 1) {
			System.out.println("Enter Player 1 Name:");
			String Choice2 = sc.next();
			System.out.println("Enter Player 2 Name:");
			String Choice3 = sc.next();
			System.out.println("Player:" + Choice2);
			int point = 1;
			int round1 = 0;
			int score1 = 0;
			while (point != 0 && round1 < 12) {
				System.out.println("Enter 1 to open the book:");
				int key = sc.nextInt();
				if (key == 1) {
					int Number = (int) (Math.floor(Math.random() * (max - min + 1) + min));
					point = Number % 7;
					score1 = point + score1;
					round1++;
					if (point == 0)
						System.out.println("oops you are out");

					System.out.println("pageNumber:" + Number + "\nPoint:" + point + "\nScore:" + score1);
				}
			}
			System.out.println();
			System.out.println("The total Score: " + score1 + "\nThe Score to make by Player 2 is:" + (++score1));
			System.out.println("Player2:" + Choice3);
			int min1 = 1, max1 = 300;
			int point2 = 1;
			int round2 = 0;
			int score2 = 0;
			while (point2 != 0 && round2 < 12) {
				System.out.println("Enter 1 to open the book:");
				int key2 = sc.nextInt();
				if (key2 == 1) {
					int Number1 = (int) (Math.floor(Math.random() * (max1 - min1 + 1) + min1));
					point2 = Number1 % 7;
					score2 = point2 + score2;
					if(score2>score1) {
						System.out.println("pageNumber:" + Number1 + "\nPoint:" + point2 + "\nScore:" + score2);

						break;

					}

					round2++;
					if (point2 == 0)
						System.out.println("oops you are out");
					System.out.println("pageNumber:" + Number1 + "\nPoint:" + point2 + "\nScore:" + score2);

				}

			}
			if(score1>score2) {
				System.out.println("Player 1 is the winner: "+Choice2);
			}
			else if(score2>score1){
				System.out.println("Player 2 is the winner: "+Choice3);
			}
			else {
				System.out.println("The Game is Tie");
			}
		} 
		
		else {
			System.out.println("You Exited the Game");
		}
	}
}
