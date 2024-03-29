package com.aurionpro.model;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private static int count;

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.count++;
	}

	public Account(int accountNumber, String name) {
		this(accountNumber, name, 1000);
	}

	public Account(int acccountNumber) {
		this(101, "Unknown", 1000);
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

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	public static int getAccountCount() {
		return count;
	}
	
}
