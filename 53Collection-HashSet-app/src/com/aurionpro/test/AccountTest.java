package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.aurionpro.model.Account2;

public class AccountTest {
	public static void main(String[] args) {
		Set<Account2> set = new HashSet<>();
		set.add(new Account2(101,"Raju",10000));
		set.add(new Account2(101,"Raj",10000));
		set.add(new Account2(102,"Rakesh",100000));
		set.add(new Account2(103,"Ram",1000));
//		System.out.println(set);
		
		for(Account2 x:set) {
			System.out.println(x);
		}
	}
}
