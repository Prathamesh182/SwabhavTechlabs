package com.aurionpro.test;

import javax.net.ssl.KeyManagerFactorySpi;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Salesman;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager managers = new Manager(101,"Prathamesh",10000);
		printSalaryDetails(managers);
		Salesman salesmans = new Salesman(102,"AKshay",10000);
		printSalaryDetails(salesmans);
		Accountant accountants = new Accountant(103,"Amogh",10000);
		printSalaryDetails(accountants);
		
		
	}

	private static void printSalaryDetails(Accountant accountants) {
		System.out.println("------------------------------------------------------------");
		System.out.println("the employee id :"+accountants.getEmployeeId());
		System.out.println("the employee name :"+accountants.getName());
		System.out.println("the basic salary is:"+accountants.getBasicSalary());
		
		System.out.println("the annual ctc is:"+accountants.calculateAnnualCTC());
	}

	private static void printSalaryDetails(Salesman salesmans) {
		System.out.println("------------------------------------------------------------");
		System.out.println("the employee id :"+salesmans.getEmployeeId());
		System.out.println("the employee name :"+salesmans.getName());
		System.out.println("the basic salary is:"+salesmans.getBasicSalary());
		
		System.out.println("the annual ctc is:"+salesmans.calculateAnnualCTC());
		
	}

	private static void printSalaryDetails(Manager managers) {
		System.out.println("----------------------------------------------------------");
		System.out.println("the employee id :"+managers.getEmployeeId());
		System.out.println("the employee name :"+managers.getName());
		System.out.println("the basic salary is:"+managers.getBasicSalary());
	
		System.out.println("the annual ctc is:"+managers.calculateAnnualCTC());
	}

}
