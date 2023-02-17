package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.model.Account2;
import com.aurionpro.model.SortByBalance;
import com.aurionpro.model.SortByName;

public class AccountTest {

	public static void main(String[] args) {
		List<Account2> list = new ArrayList<>();
		Account2 accounts = new Account2(101, "Prathamesh", 15000);
		Account2 accounts1 = new Account2(102, "Akshay", 200000);
		Account2 accounts2 = new Account2(103, "Raj", 10000);
		Account2 accounts3 = new Account2(10, "Bacchan", 1000000);
		list.add(accounts);
		list.add(accounts1);
		list.add(accounts2);
		list.add(accounts3);
		double total = 0;
		double max = list.get(0).getBalance();

		int index = 0;
		int index1 = 0;

		for (Account2 x : list) {
			System.out.println(x);
			total += x.getBalance();
			for (int i = 0; i < list.size(); i++)
				if (max < list.get(i).getBalance()) {

					index = i;

				}
			for (int j = 0; j < list.size(); j++)
				if (max > list.get(j).getBalance()) {

					index1 = j;

				}

		}
	//	Collections.sort(list,Collections.reverseOrder());
	//	Collections.sort(list, new SortByBalance());
		Collections.sort(list,new SortByName());

		System.out.println("The Total Balance is: " + total);
		System.out.println("The Highest Balance is: " + list.get(index));
		System.out.println("The Lowest Balance is: " + list.get(index1));
		System.out.println("The List in Reverse Order is: ");
		System.out.println(list);
	}

	

	
}
