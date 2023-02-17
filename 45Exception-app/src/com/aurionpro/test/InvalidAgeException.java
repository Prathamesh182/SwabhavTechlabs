package com.aurionpro.test;

public class InvalidAgeException extends Exception {
//public class InvalidAgeException extends RunTimeException{	
	private String message;

	public InvalidAgeException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.getClass().getName() + " " + message;
	}

	@Override
	public String toString() {
		return "InvalidAgeException: "+message;
	}
	//public InvalidAgeException(String message){
	//super(message);}
}