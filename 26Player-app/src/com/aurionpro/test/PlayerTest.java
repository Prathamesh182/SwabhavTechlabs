package com.aurionpro.test;

import com.aurionpro.model.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player[] players =  {
				new Player("Ram",21,"India"),
				new Player("Raj",24,"Africa"),
				new Player("Raju",20,"China"),
				new Player("Amit",2,"Vietnam")};
		
		
	for(Player x:players) {
		//printPlayerDetails(x);
		System.out.println(x);
		
		}
	System.out.println();
	System.out.println("elder player is:");
	//System.out.println(players[players[0].ElderPlayer(players)]);
	System.out.println(players[0].ElderPlayer(players));
	}
	
	
//	private static void printPlayerDetails(Player x2) {
//		System.out.println("The Name of The Player is: "+x2.getName());
//		System.out.println("The Age of the Player is: "+x2.getAge());
//		System.out.println("The Country of the Player is: "+x2.getCountry());
//		System.out.println();
//	}

}
