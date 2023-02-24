package com.aurionpro.test;

import com.aurionpro.model.IAddable;
import com.aurionpro.model.IGreetable;
import com.aurionpro.model.addIntegers;

public class AddTest {

	public static void main(String[] args) {
//		IAddable addObj = new addIntegers();
//		System.out.println(addObj.add(10, 20));
//
//		IAddable addObj2 = new IAddable() {
//
//			@Override
//			public int add(int a, int b) {
//				return a + b;
//			}
//
//		};
//		System.out.println(addObj2.add(20, 30));
//		// lamda function
//		IAddable addObj3 = (a, b) -> a + b;
//		
//		System.out.println(addObj3.add(50, 40));
//		
		IAddable Obj = AddTest :: numberAddition;
		System.out.println(Obj.add(25, 54));
	}
	
		public static int numberAddition(int a,int b) {
			return a+b;
		}
	
		
	

}
