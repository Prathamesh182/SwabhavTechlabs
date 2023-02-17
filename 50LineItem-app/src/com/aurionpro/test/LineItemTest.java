package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {

		List<LineItem> list = new ArrayList<>();
		LineItem lineitems = new LineItem(1, "Coke", 2, 10);
		LineItem lineitems2 = new LineItem(2, "ParleG", 3, 15);
		LineItem lineitems3 = new LineItem(3, "JimJam", 4, 20);
		list.add(lineitems);
		list.add(lineitems2);
		list.add(lineitems3);
		double total = 0;

		for (LineItem x : list) {

			System.out.println(x);
			total += x.calculateCost();

		}
		System.out.println("The total cost is: " + total);
//		Total(lineitems, lineitems2, lineitems3);
//		sum(lineitems, lineitems2, lineitems3);

	}

//	private static void Total(LineItem obj, LineItem lineitems2, LineItem lineitems3) {
//		System.out.println("The Cost for line one is: " + obj.calculateCost());
//		System.out.println("The Cost for line two is: " + lineitems2.calculateCost());
//		System.out.println("The Cost for Line three is: " + lineitems3.calculateCost());
//
//	}

//	private static void sum(LineItem lineitems, LineItem lineitems2, LineItem lineitems3) {
//		double total = 0;
//		total = lineitems.calculateCost() + lineitems2.calculateCost() + lineitems3.calculateCost();
//		System.out.println("The Total Cost is: " + total);
//
//	}

}
