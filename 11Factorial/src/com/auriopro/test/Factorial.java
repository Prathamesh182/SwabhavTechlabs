package com.auriopro.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,temp=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();
	
		for(int i=1;i<=n;i++) {
			temp=temp*i;
			
			
		}
		System.out.println("The Factorial of the given number is:"+temp);
	}

}
