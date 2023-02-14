package com.aurionpro.model;

public class Car extends Vehicle implements IMovable {

	public Car(String name) {
		super(name);
		System.out.println("Car is moving "+name);
	}

	@Override
	public void move() {
		System.out.println("*******************************************************");
		System.out.println(getName()+" Car is Moving");
	}

}
