package com.aurionpro.test;

import java.util.Scanner;

public class RevInt {
	public static void main(String[] args) {
		int n=-98765,rem=0,sum;
		System.out.println(n);
		 	
		 	for( sum=0; n!=0;n/=10) {
		 		rem = n%10;
			 	sum = sum*10 + rem;
			 	
			 	
		 	}
		 	System.out.println("Reverse of INT:"+sum);

		}

	}
