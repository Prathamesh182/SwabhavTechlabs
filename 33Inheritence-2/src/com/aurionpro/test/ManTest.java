package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class ManTest {

	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case5();
	}

	private static void case5() {//autoboxing-it converts primitive type to Wrapper class
		Object x;
		x=100;
		System.out.println(x.getClass());
		x="Hello";
		System.out.println(x.getClass());
	}

	private static void case3() {
		atThePark(new Man());
		atThePark(new Kid());
		atThePark(new Boy());
		atThePark(new Infant());
	}

	private static void atThePark(Man man) {
		man.eat();
		man.play();
		
	}

	private static void case2() {
		Boy boy= new Boy();
		boy.eat();
		boy.play();
		boy.read();
	}

	private static void case1() {
		Man man = new Boy();
		man.eat();
		man.play();
	}

}
