package com.aurionpro.model;

public class Man implements IEmotionable, IMannerable {

	@Override
	public void greetOnArrival() {
		System.out.println("hello");

	}

	@Override
	public void greetOnDeparture() {
		System.out.println("Bye");

	}

	@Override
	public void laugh() {
		System.out.println("Man Laughs");

	}

	@Override
	public void cry() {
		System.out.println("Man Cries");

	}

}
