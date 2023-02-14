package com.aurionpro.test;

import com.aurionpro.model.BMI;
import com.aurionpro.model.Person;

public class BMITest {

	public static void main(String[] args) {
		System.out.println("BMI Calculator");
		System.out.println();
		Person person = new Person("Prathamesh",23,1.78,79);
		System.out.println(person+"\n");
		
		BMI bmi = new BMI(person);
		
//		bmi.CalculateBMI();
		//bmi.getBmi();
		//bmi.getBodyType();
		System.out.println(person.getName()+ "'s BMI is: "+bmi.getBmi());
		System.out.println(person.getName()+"'s Body type is: "+bmi.getBodyType());
		

	}
}
