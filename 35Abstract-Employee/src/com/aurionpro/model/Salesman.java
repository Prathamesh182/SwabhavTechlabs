package com.aurionpro.model;

public class Salesman extends Employee {
	private double bonus ;


	public Salesman(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		bonus=0.30*basicSalary;
		
	}

	
	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}



	@Override
	public double calculateAnnualCTC() {
		return (getBasicSalary()+bonus)*12;
	}


	
}
