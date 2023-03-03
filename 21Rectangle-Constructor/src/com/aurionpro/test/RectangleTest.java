package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
	//	Rectangle rectangle = new Rectangle(10,20);
		//printRectangleDetails(rectangle);
		
		Rectangle rectangle1 = new Rectangle(30,20);
		printRectangleDetails(rectangle1);
		
		Rectangle rectangle2 = new Rectangle();
		printRectangleDetails(rectangle2);
		
		Rectangle rectangle3 = new Rectangle(20);
		printRectangleDetails(rectangle3);

		
	}
	
	private static void printRectangleDetails(Rectangle rectangle) {
		System.out.println("Width :"+rectangle.getWidth());
		System.out.println("Height :"+rectangle.getHeight());
		System.out.println("Area of Rectangle :"+rectangle.CalculateArea());
		System.out.println("the color :"+rectangle.getColor());
		System.out.println();
	}

}
