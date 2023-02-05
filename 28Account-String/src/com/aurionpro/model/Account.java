package com.aurionpro.model;

public class Account {
	private String accountNumber;
	private String name;
	private double balance;
	private static int i=0;

	public Account(String accountNumber, String name, double balance) {
		this.accountNumber = "S00"+(i++);
		this.name = name;
		this.balance = balance;
		this.i++;
	}

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = "S";
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
	public static  String getAccountNumber1() {
		return i;
	}
	

}