package com.aurionpro.model;

public class Accountant extends Employee {
	public double performanceAllowance ;

	public Accountant(int employeeId, String name, double basicSalary) {
		super(employeeId, name, basicSalary);
		performanceAllowance=0.15;
	}


	@Override
	public double calculateAnnualCTC() {
		return (getBasicSalary()+performanceAllowance)*12;
	}

	
}
