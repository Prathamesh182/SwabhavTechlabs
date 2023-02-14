package com.aurionpro.model;

public class Bike extends Vehicle implements IMovable {

	public Bike(String name) {
		super(name);
		System.out.println("Bike is moving "+name);
	}

	@Override
	public void move() {
		System.out.println(getName()+ " Bike is moving");
	}

}
