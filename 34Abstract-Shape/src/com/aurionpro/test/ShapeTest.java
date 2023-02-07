package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle = new Circle(Color.red,7);
		circle.getColor();
		System.out.println("The Color is:"+circle.getColor()+"\n"+"The Area of circle is:"+circle.calculateArea());
		System.out.println();
		Rectangle rectangle = new Rectangle(Color.blue,20,30);
		rectangle.getColor();
		System.out.println("The Color is:"+rectangle.getColor()+"\n"+"The Area of rectangle is:"+rectangle.calculateArea());
	}

}
