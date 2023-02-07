package com.aurionpro.test;

import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccounTest {

	public static void main(String[] args) {
		SavingAccount saving = new SavingAccount(101, "Prathamesh", 100000);
		saving.withdraw(10000);
		saving.deposit(50000);
		printAccountDetails(saving);
		CurrentAccount current = new CurrentAccount(102, "Ajusir", 1000);
		current.withdraw(10000);
		// current.deposit(50000);

		printAccountDetails(current);
	}

	private static void printAccountDetails(CurrentAccount current) {
		System.out.println("The account numberis:" + current.getAccountNumber());
		System.out.println("the account name is: " + current.getName());

		System.out.println("the account balance is:" + current.getBalance());
		System.out.println();

	}

	private static void printAccountDetails(SavingAccount saving) {
		System.out.println("The account numberis:" + saving.getAccountNumber());
		System.out.println("the account name is: " + saving.getName());

		System.out.println("the account balance is:" + saving.getBalance());
		System.out.println();
	}

}
