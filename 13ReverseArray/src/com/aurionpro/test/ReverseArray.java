package com.aurionpro.test;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40 };

		System.out.println("The Given Array Is:");
		for (int n : array) {
			System.out.println(n);
			
		}
		System.out.println("the reverse array:");

		for (int n = array.length - 1; n >= 0; n--) {
			System.out.println(array[n]);

		}
		System.out.println("The Given Array Is:");
		int[] n= new int[array.length];
		int j=array.length;
		for (int i=0;i<array.length;i++) {
			
			n[j-1]=array[i];
			j=j-1;
			System.out.println(n[j]);
			
		}

	}
}
