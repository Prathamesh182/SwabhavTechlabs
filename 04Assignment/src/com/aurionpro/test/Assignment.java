package com.aurionpro.test;

import java.util.*;

public class Assignment {

	public static void main(String[] args) {
		System.out.println("Welcome to the TreasureIsland");
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose left or right");
		String option = sc.next();
		
		if (option.equalsIgnoreCase("left")) {
			System.out.println("proceed");
			System.out.println("wait or swim");
			String ways = sc.next();
			if (ways.equalsIgnoreCase("wait")) {
				System.out.println("Proceed");
				System.out.println("choose the door red/blue/yellow");
				String colors = sc.next();
				if (colors.equalsIgnoreCase("Yellow")) {
					System.out.println("You win");
				} else if (colors.equalsIgnoreCase("Red")) {
					System.out.println("Burned by th fire Game Over");
				} else if (colors.equalsIgnoreCase("Blue")) {
					System.out.println("Eaten by the beast gameover");
				} else {
					System.out.println("Gameover");
				}

			} else {
				System.out.println("Attack by the trout gameover");
			}

		}

		else {
			System.out.println("Fall into Hole GameOver");
		}

	}

}
