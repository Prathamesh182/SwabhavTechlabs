package com.aurionpro.model;

public class OrderRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Order has been Created");

	}

	@Override
	public void update() {
		System.out.println("Order has been Updates");

	}

	@Override
	public void delete() {
		System.out.println("Order has been Deleted");
	}

	@Override
	public void read() {
		System.out.println("Order has been Readed");

	}

}
