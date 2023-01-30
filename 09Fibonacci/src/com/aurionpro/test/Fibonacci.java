package com.aurionpro.test;

import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		int n=5,num1 = 0, num2 = 1, num3 ;

		System.out.println("The fibonacci series of the entered value is:");

		for (int i = 0; i < n; i++) {
			System.out.println(num1 + "");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;

			
		}

	}

}
