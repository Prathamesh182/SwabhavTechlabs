package com.aurionpro.model;

public class ProductRepository implements IRepository {

	@Override
	public void create() {
		System.out.println("Product has been Created");
	}

	@Override
	public void update() {
		System.out.println("Product has been Updated");

	}

	@Override
	public void delete() {
		System.out.println("Product has been Deleted");

	}

	@Override
	public void read() {
		System.out.println("Product has been readed");

	}

}
