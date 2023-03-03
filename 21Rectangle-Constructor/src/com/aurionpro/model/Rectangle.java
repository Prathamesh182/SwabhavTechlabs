
package com.aurionpro.model;

public class Rectangle {
	private int width;
	private int height;
	private Color color;

	public Rectangle(int width, int height, Color color) {

		this.width = width;
		this.height = height;
		this.color = color;
	}

	public Rectangle(int width, int height) {
		this(width,height,Color.red);
	}

	public Rectangle() {
		this(7, 10, Color.blue);
	}
	
	public Rectangle(int height) {
		this(10,height,Color.green);
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}

	public double CalculateArea() {
		return width * height;
	}

}
