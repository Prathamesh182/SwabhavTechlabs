package com.aurionpro.model;

public class CustomerRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Custormer Id has been Created");

	}

	@Override
	public void update() {
		System.out.println("Customer Id has been Updated");
	}

	@Override
	public void delete() {
		System.out.println("Customer Id has been deleted");

	}

	@Override
	public void read() {
		System.out.println("Customer Id has been readed");

	}

}
