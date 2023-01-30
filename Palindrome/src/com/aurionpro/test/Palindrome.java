package com.aurionpro.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n=0,rem=0,temp=0,sum=0;
		System.out.println("Enter The Number:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(temp=n;n>0;n/=10) {
			rem=n%10;
			sum=sum*10+rem;
			
		}
		if(temp==sum) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
	}

}
