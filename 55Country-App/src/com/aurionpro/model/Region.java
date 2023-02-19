package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Region {

	private int id;
	private String name;
	private List<Country> countries;
	
	
	public Region(int id, String name) {
		
		this.id = id;
		this.name = name;
		countries= new ArrayList<Country>();

	}
	public List<Country> getCountries() {
		return countries;
	}
//	public void setCountries(List<Country> countries) {
//		this.countries = countries;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addCountries(Country country) {
		countries.add(country);
	}
	@Override
	public String toString() {
		return "\n\nRegion (id= " + id + ", name=" + name + "),\ncountries=" + countries + "\n\n**************************************************"
				+ "**************************************************"; 
	}
	
	
	
	
	
	
	
}
