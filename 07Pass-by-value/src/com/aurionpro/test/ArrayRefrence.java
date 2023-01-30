package com.aurionpro.test;

public class ArrayRefrence {
	
	public static void main(String[] args) {
		int[] numbers= {10,20,30,40};
		convertArrayToZero(numbers);
			
		for(int x : numbers) {
			System.out.println(x);
		}
//		System.out.println(numbers);
	}

	private static void convertArrayToZero(int[] numbers) {
		for(int i=0;i<numbers.length;i++) {
		numbers[i]=0;
		}
		
	}

}
