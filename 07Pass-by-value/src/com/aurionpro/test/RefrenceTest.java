package com.aurionpro.test;

import com.aurionpro.model.Circle;

public class RefrenceTest {

	public static void main(String[] args) {
		Circle circle = new Circle();//object created for the refrence
		 circle.radius=10;
		convertRadiusToZeroByRefrence(circle);
		System.out.println(circle.radius);
	}

	private static void convertRadiusToZeroByRefrence(Circle cir) {
		cir.radius = 0;
		
	}

}
