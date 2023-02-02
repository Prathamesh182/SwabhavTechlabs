package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account[] accounts = {
		new Account(101,"Prathamesh",10000),
		new Account(102,"Amogh",30000),
		new Account(103,"Akshay",40000),
		new Account(104,"Sankalp",20000),
		};
		double max = accounts[0].getBalance();
		int i, index = 0;
		for (i = 0; i < accounts.length; i++) {
			
			if (max < (accounts[i].getBalance())) {
			max = accounts[i].getBalance();
				index = i;
			}
		}
		for (Account x : accounts) {
			printAccountDetails(x);
		}
		System.out.println("The Highest Balance is:" + accounts[index]);
		System.out.println();
		// System.out.println("Sorting the accounts");		
	}

	private static void printAccountDetails(Account x) {
		System.out.println("The Account Number is:" + x.getAccountNumber());
		System.out.println("The Account Name is:" + x.getName());
		System.out.println("The Account Balance is:" + x.getBalance());
		System.out.println();
	}

}
