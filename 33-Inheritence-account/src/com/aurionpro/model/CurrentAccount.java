package com.aurionpro.model;

public class CurrentAccount extends Account {
	
	private static double OVER_DRAFT_LIMIT=-20000; 
	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber,name,balance);
	}
	@Override
	public void withdraw(double amount) {
		if((this.getBalance()-amount)>OVER_DRAFT_LIMIT) {
			this.setBalance(getBalance()-amount);
			
		}
	}
		
	

}
