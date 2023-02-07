package com.aurionpro.test;

import com.aurionpro.model.Animal;
import com.aurionpro.model.Cow;
import com.aurionpro.model.Lion;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal("hello Animals",true);
		Cow child = new Cow("Hello Herbivorous",false);
		Lion child2 = new Lion("Hello Carnivorous",true);
		System.out.println(animal);
		animal.eat();
		System.out.println(child);
		child.eat();
		System.out.println(child2);
		child2.eat();
	}

}
