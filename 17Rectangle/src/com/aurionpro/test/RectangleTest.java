package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		// System.out.println(rectangle.height);
		// System.out.println(rectangle.width);
		// System.out.println(rectangle.color);
		rectangle.height = 10;
		rectangle.width = 20;
		rectangle.color = ("red");
		System.out.println(rectangle.height);
		System.out.println(rectangle.width);
		System.out.println(rectangle.color);
		Rectangle rectangle1 = new Rectangle();
		rectangle1.height = 22.2;
		rectangle1.width = 10;
		rectangle.color = ("blue");
		System.out.println(rectangle1.height);
		System.out.println(rectangle1.width);
		System.out.println(rectangle1.color);

	}

}
