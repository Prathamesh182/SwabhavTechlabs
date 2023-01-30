package com.aurionpro.test;
import java.util.*;
public class TreasureHunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Welcome to the TreasureIsland");
		System.out.println("Enter The Choice");
		Scanner sc = new Scanner(System.in);
	    int Choice = sc.nextInt();
	 
	    
	    if(Choice == 1) {
	    	System.out.println("Fall into a hole game over");
	    
		}
	    else if (Choice == 2) {
	    	System.out.println("you have selected left");
	    	
	    }
	    System.out.println("Enter the choice");
	    int Choice2 = sc.nextInt();
	   
	    if (Choice2 == 1) {
	    	
	    	
	    	System.out.println("Attacked by the troud GAme over");
	    	
	    }
	    else if(Choice == 2) {
	    	System.out.println("you have selected to wait");
	    
	    }
	    System.out.println("Enter the choice");
	    int Choice3 = sc.nextInt();
	   
	    if (Choice3 == 1) {
	    	
	    	
	    	System.out.println("Eaten by beast Gameover");
	    	
	    }
	    else if(Choice3 == 2) {
	    	System.out.println("Burned by Fire Game Over");
	    	
	    
	    
	    
	}
	    else {
	    	System.out.println("you win");
	    }

}
}