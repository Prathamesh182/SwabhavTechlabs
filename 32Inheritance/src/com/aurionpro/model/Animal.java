package com.aurionpro.model;

public class Animal {
	public String name;
	public boolean isCarnivorous;
	public Animal(String name , boolean isCarnivorous) {
		
		super();
		this.name=name;
		this.isCarnivorous=isCarnivorous;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCarnivorous() {
		return isCarnivorous;
	}
	public void setCarnivorous(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
	}
	public void eat() {
		System.out.println("i am the animal");
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", isCarnivorous=" + isCarnivorous + "]";
	}
	
}

