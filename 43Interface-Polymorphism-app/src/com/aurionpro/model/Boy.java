package com.aurionpro.model;

public class Boy implements IMannerable {

	@Override
	public void greetOnArrival() {
		System.out.println("Hello Boy");

	}

	@Override
	public void greetOnDeparture() {
		System.out.println("bye boy");

	}

}
