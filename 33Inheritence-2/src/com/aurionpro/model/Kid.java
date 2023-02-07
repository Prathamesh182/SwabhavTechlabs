package com.aurionpro.model;

public class Kid extends Man {
	public void write() {
		System.out.println("Kid Writes....");
	}
	@Override
	public void eat() {
		System.out.println("kid eats...");
	}
	@Override
	public void play() {
		System.out.println("kid plays....");
	}
}
