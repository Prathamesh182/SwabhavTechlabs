package com.aurionpro.model;

public class Account {

	private int accountNumber;
	private String name;
	private double balance;

	public Account(int accountNumber, String name, double balance) {

		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
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
		System.out.println("Ammount has been Deposited Successfully\nCurrent Balance: "+this.balance);
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if(balance- amount<1000) { 
		throw new InsufficientBalanceException(this ,amount);

		}
		balance -= amount;
		System.out.println("Amount has been withdrawn successfully\nCurrent Balance: "+this.getBalance());
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
}
