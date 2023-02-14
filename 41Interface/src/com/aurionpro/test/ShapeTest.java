package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5,12);
		System.out.println(rectangle.calculateArea());
		rectangle.showColor();
		//rectangle.calculateArea();
		
	}

}
