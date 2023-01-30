package com.aurionpro.test;
import java.util.*;
import java.util.Scanner;

public class ConvertInt {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		String HEXADECIMAL = Integer.toHexString(n);
		System.out.println("The number in HexaDecimal is:"+HEXADECIMAL);
		String  OCTAL = Integer.toOctalString(n);
		System.out.println("The number in Octal is:"+OCTAL);
		String BINARY = Integer.toBinaryString(n);
		System.out.println("The number In Binary is:"+BINARY);
	}
}
