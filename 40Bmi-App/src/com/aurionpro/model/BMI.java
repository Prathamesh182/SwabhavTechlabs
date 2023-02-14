package com.aurionpro.model;

public class BMI {
	private Person person;
	private double bmi;
	public BMI(Person person) {
		this.person = person;
		this.bmi = CalculateBMI();
	}
	public  double CalculateBMI(){
		return (person.getWeight()/(person.getHeight()*person.getHeight()));
		
		
	}
	public String getBodyType() {
		if(bmi < 18.5) {
			return "underWeight";
		}
		else if(bmi>=18.5 && bmi <25) {
			return "healthy weight";
		}
		else if(bmi>=25 && bmi< 30) {
			return "overweight";
		}
		else {
			return "obese";
		}
	}
		public double getBmi() {
			return bmi;
		
	}
		
	
}
