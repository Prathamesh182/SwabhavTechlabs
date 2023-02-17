package com.aurionpro.model;

public class InsufficientBalanceException extends Exception {
	Account account;
	double amount;

	public InsufficientBalanceException(Account account, double amount) {
		this.account = account;
		this.amount = amount;

	}

	@Override
	public String getMessage() {
		return  "Cannot withdraw the amount: " + amount + "\nThe AccountNumber is: "
				+ account.getAccountNumber() + "\nThe account Name is: " + account.getName()
				+ "\nThe Account Balance is:  " + account.getBalance();

	}

}
