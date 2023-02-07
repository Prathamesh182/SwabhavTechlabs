package com.aurionpro.model;

public class Boy extends Man {
	public void read() {
		System.out.println("boy reads...");
	}
	@Override
	public void eat() {
		System.out.println("Boy eats...");
	}
	@Override
	public void play() {
		System.out.println("Boy plays...");
	}

}
