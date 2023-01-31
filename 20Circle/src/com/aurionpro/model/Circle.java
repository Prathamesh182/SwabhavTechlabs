package com.aurionpro.model;

public class Circle {
	private double radius;
	private bordertype border;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public bordertype getBorder() {
		return border;
	}

	public void setBorder(bordertype border) {
		this.border = border;
	}

	public double calculateArea() {

		return radius * radius * Math.PI;

	}

}
