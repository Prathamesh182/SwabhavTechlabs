package com.aurionpro.model;

public class Rectangle {
	private double height;
	private int width;
	private Color color;

	public void setHeight(double ht) {
		height = getCorrectedValue(ht);
	}

	private double getCorrectedValue(double num) {
		if (num < 0) {
			return 1;
		}
		if (num > 100) {
			return 100;
		}
		return num;
	}		

	public void setWidth(int wd) {
		width = getCorrectedValue1(wd);
	}

	private int getCorrectedValue1(int num1) {
		if (num1 < 0) {
			return 1;
		}
		if (num1 > 100) {
			return 100;
		}
		return num1;
	}



	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	

	}


