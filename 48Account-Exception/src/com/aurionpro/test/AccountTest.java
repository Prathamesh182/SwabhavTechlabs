package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientBalanceException;

public class AccountTest {

	public static void main(String[] args) {
		Account account= new Account(101,"raju",2000);
		System.out.println(account);
//		try {
//			account.withdraw(100);
//		} catch (InsufficientBalanceException e) {
//			System.out.println(e.getMessage());
//		}
		try {
			account.withdraw(100);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		account.deposit(1000);
		
	}

}
