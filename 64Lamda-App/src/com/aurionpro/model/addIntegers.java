package com.aurionpro.model;


	public class addIntegers implements IAddable,IGreetable {

		@Override
		public int add(int a, int b) {
			return a+b;
		}

		@Override
		public void greet(String name) {
			System.out.println("Hello"+name);
		}

	}



