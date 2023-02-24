package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreansTest {

	public static void main(String[] args) {
		//int[] numbers = { 10, 20, 30 };
		Stream<Integer> obj = Stream.of(10,20,30,40);
//		for(int x: numbers) {
//			System.out.println(x);
//			
//		}
		//obj.forEach((n) -> System.out.println(n));
		obj.forEach(System.out::println);

		Stream<String> stringStream = Stream.of("\nGanesh","Vignesh","Mahesh");
		stringStream.forEach(System.out::println);
		
		
		List<String> players =Arrays.asList("\nNitesh","Vignesh","Mahesh");
		players.stream().forEach(System.out::println);
		for(int i=0;i<players.size();i++) {
			System.out.println(players.get(i).toUpperCase());
		}
	}

}
