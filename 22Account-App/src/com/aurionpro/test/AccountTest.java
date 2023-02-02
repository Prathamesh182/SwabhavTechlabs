package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(102,"AjuSir",3000);
		printAccountDetail(account);
		account.withdraw(200);
		printAccountDetail(account);
		account.deposit(100000);
		printAccountDetail(account);
		Account account1 = new Account();
		printAccountDetail(account1);
		
	}

	private static void printAccountDetail(Account account) {
		System.out.println("AccountNo :"+account.getAccountNumber());
		System.out.println("Name :"+account.getName());
		System.out.println("Balance :"+account.getBalance());
		System.out.println();
	}

}
