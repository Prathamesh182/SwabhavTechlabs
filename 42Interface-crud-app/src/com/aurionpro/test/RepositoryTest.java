package com.aurionpro.test;

import com.aurionpro.model.CustomerRepository;
import com.aurionpro.model.IRepository;
import com.aurionpro.model.OrderRepository;
import com.aurionpro.model.ProductRepository;

public class RepositoryTest {

	public static void main(String[] args) {
		
		doDbOperations(new ProductRepository());
		doDbOperations(new CustomerRepository());
		doDbOperations(new OrderRepository());
	}

	private static void doDbOperations(IRepository obj) {
		obj.create();
		obj.delete();
		obj.update();
		obj.read();
		System.out.println("*********************************************");
	}

	
}
