package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle[] rectangle1 = { new Rectangle(10, 10), new Rectangle(20, 30), new Rectangle(30, 40) };

		for (Rectangle x : rectangle1) {
			printRectangle(x);

		}
	}

	private static void printRectangle(Rectangle x) {
		System.out.println("height :" + x.getHeight());
		System.out.println("width :" + x.getWidth());
		System.out.println("area of rectangle :" + x.CalculateArea());
		System.out.println();
	}

}
