package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.bordertype;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(2);
		circle.setBorder(bordertype.dashed);
		circle.calculateArea();
		System.out.println(circle.getRadius());
		System.out.println(circle.getBorder());
		System.out.println(circle.calculateArea());

	}

}
