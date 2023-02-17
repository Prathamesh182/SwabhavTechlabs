package com.aurionpro.model;

import java.util.Comparator;

public class SortByBalance implements Comparator<Account2> {

	@Override
	public int compare(Account2 o1, Account2 o2) {
		return  Double.compare(o1.getBalance(),o2.getBalance());
	}

}
