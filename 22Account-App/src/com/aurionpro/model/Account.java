package com.aurionpro.model;

public class Account {
	private int accountNumber;
	private String name;
	private static double balance;

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public Account(int accountNumber, String name) {
		this(accountNumber, name, balance = 1000);
	}

	public Account() {
		this(101, "Prathamesh", balance = 1000);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
	balance += amount;
		
		
	}
	public void withdraw(double amount) {
		if(balance-amount>1000) {
			balance = balance - amount;
			
		}
	}

}
