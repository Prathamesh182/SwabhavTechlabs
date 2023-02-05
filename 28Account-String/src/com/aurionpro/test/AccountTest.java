package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account("Water",10000);
		//printAccountDetails(acc);
		Account acc1 = new Account("Sun",100000);
		int i =Account.getAccountNumber1();
		System.out.println(i);
	}

}
