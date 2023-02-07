package com.aurionpro.model;

public class SavingAccount extends Account {

	private static double MIN_BALANCE = 1000;
	public SavingAccount(int accountNumber, String name, double balance) {
		super(accountNumber,name,balance);
		
	}
	@Override
	public void withdraw(double amount) {
		if((this.getBalance()-amount)>MIN_BALANCE) {
			this.setBalance(getBalance()-amount);
		}
	}
}
