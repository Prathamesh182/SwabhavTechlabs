package com.aurionpro.model;

public class Rectangle implements Shape {
	private double height;
	private double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

//	public double getHeight() {
//		return height;
//	}
//
//	public void setHeight(double height) {
//		this.height = height;
//	}
//
//	public double getWidth() {
//		return width;
//	}
//
//	public void setWidth(double width) {
//		this.width = width;
//	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}

	@Override
	public double calculateArea() {
		return height*width;
	}

	@Override
	public void showColor() {
		System.out.println("It is Blue In Color");
		System.out.println(PI);
	}

}
