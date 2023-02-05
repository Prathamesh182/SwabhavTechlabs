package com.aurionpro.test;

import java.util.Arrays;

public class ArrayStatistics {

	public static void main(String[] args) {
		int[] array = new int[] {1,3,3,5,9,8,7,4,5,1,2};
		int sum=0 , i ,count=1;
		double avg=0,median=0;
		for(i=0;i<array.length;i++) {
			sum += array[i];
		
		}
		avg=sum/array.length;
		Arrays.sort(array);
		
		
		
		System.out.println("The Sum of Array is: "+sum);
		System.out.println("The Average of Array is: "+avg);
		System.out.println("The Minimum value of Array is:"+array[0]);
		System.out.println("The MAximum value of Array is: "+array[array.length-1]);
		System.out.println("The Median of Array is: "+median);
		System.out.println("Frequency");
		
	} 
		

}
