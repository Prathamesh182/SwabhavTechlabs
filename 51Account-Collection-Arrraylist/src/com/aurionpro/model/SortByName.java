package com.aurionpro.model;

import java.util.Comparator;

public class SortByName implements Comparator<Account2>{



	@Override
	public int compare(Account2 o1, Account2 o2) {
		return o1.getName().compareTo(o2.getName());
	}
}