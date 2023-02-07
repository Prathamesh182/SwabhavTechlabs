package com.aurionpro.model;

public abstract class Shape {
	Color color;

	public Shape(Color color) {
		super();
		this.color=color;

	}

	public Color getColor() {
		return color;
	}

	public abstract double calculateArea();

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}

}
