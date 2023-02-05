package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account(101,"Water",10000);
		//printAccountDetails(acc);
		Account acc1 = new Account(102,"Sun");
		//printAccountDetails(acc1);
		Account acc2 = new Account(103);
		//printAccountDetails(acc2);
		int count = Account.getAccountCount();
		System.out.println(count);
	}
	
//	private static void printAccountDetails(Account acc) {
//		
//	}

}
