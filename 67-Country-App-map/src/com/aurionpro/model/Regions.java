package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Regions {
	private String name;
	private int id;
	private List<Country>countries;
	
	public Regions( int id,String name) {
		super();
		this.name = name;
		this.id = id;
		this.countries= new ArrayList<Country>();
		
		
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public List<Country> getCountries() {
		return countries;
	}
	
	public void addCountries(Country country) {
		countries.add(country);
	}

	@Override
	public String toString() {
		return "Regions [name=" + name + ", id=" + id + ", countries=" + countries + "]\n";
	}
	

	
	
	

}
