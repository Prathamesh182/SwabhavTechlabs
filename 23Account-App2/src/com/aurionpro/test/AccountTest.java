package com.aurionpro.test;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(102, "AjuSir", 3000);
		printAccountDetail(account);
//		account.withdraw(200);
//		printAccountDetail(account);
//		account.deposit(100000);
//		printAccountDetail(account);
//		Account account1 = new Account();
//		printAccountDetail(account1);
		withdraw(account, 1000);
		deposit(account, 20000);
	}

	private static void deposit(Account acc, int i) {
		if (acc.deposit(i)) {
			System.out.println("The account number is:" + acc.getAccountNumber());
			System.out.println("The amount is suucessfully deposited");
			System.out.println("The amount deposited is: " + acc.getBalance());
			System.out.println();
		} else {
			System.out.println("The Entered Amount is:");
			System.out.println("Invalid Amount");
			System.out.println();
		}

	}

	private static void withdraw(Account acc, int i) {
		if (acc.withdraw(i)) {
			System.out.println("Withdrawl is in Process");
			System.out.println("Successfully withdrawn:" + acc.getBalance());
			System.out.println();
		} else {
			System.out.println("WithDraw Status");
			System.out.println("Insufficient Funds");
			System.out.println();
		}
	}

	private static void printAccountDetail(Account account) {
		System.out.println("AccountNo :" + account.getAccountNumber());
		System.out.println("Name :" + account.getName());
		System.out.println("Balance :" + account.getBalance());
//		System.out.println("The Amount has been sucessfully withdrawn: ");
		System.out.println();
	}

}
