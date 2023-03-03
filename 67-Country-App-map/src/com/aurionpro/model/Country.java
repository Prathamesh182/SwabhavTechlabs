package com.aurionpro.model;

public class Country {
	private String countryname;
	private String countrycode;
	private int regionId;
	
	public Country(String countryname, String countrycode, int regionId) {
		super();
		this.countryname = countryname;
		this.countrycode = countrycode;
		this.regionId = regionId;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", countrycode=" + countrycode + ", regionId=" + regionId + "]";
	}
	
	
	
	

}
