package com.aurionpro.model;

public class Account2{//implements Comparable<Account> {
	private int accountNumber;
	private String name;
	private double balance;
	public Account2(int accountNumber, String name, double balance) {
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
	@Override
	public String toString() {
		return " Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]\n";
	}
//	@Override
//	public int compareTo(Account o) {
//		return name.compareTo(o.name);
//	}
//	
	

}
