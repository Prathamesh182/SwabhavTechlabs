package com.aurionpro.test;

import java.util.Scanner;

public class PigGameTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dice = 0, turn = 0, turnscore = 0, points = 0;
		while (points < 20) {
			turn++;
			System.out.println("Turn :" + turn);
			turnscore = 0;
			dice = 0;
			while (dice != 1) {

				System.out.println("Roll Or Hold (r/h):");
				String Select = sc.next();
				if (Select.equalsIgnoreCase("r")) {
					System.out.println("You Selected Roll");
					dice = (int) (Math.random() * 6) + 1;
					System.out.println("dice: " + dice);
					turnscore = turnscore + dice;
				
					if (dice == 1) {
					System.out.println();
					System.out.println("oops you are out");
					System.out.println("turnscore total:"+points);
					}
					else if((turnscore+points)>=20) {
						points=turnscore+points;
						System.out.println();
						System.out.println("Score for turn:"+turnscore);
						System.out.println("Total score"+points);
						break;
					}
				}

				else if (Select.equalsIgnoreCase("h")) {
					System.out.println("You Selected Hold");
					points=points+turnscore;
					System.out.println();
					System.out.println("Score for turn:"+turnscore);
					System.out.println("Total Score:"+points);
					break;
					

				}
				// System.out.println(roll);
			}
		}
		System.out.println();
		System.out.println("You Won In: "+turn+" turns");
		System.out.println();
		System.out.println("game over");
	}
	
}