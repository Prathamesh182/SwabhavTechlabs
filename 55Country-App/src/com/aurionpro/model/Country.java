package com.aurionpro.model;

public class Country {
	private String countrycode;
	private String countryname;
	private int regionid;

	public Country(String countrycode, String countryname, int regionid) {
		this.countrycode = countrycode;
		this.countryname = countryname;
		this.regionid = regionid;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public int getRegion() {
		return regionid;
	}

	public void setRegion(int region) {
		this.regionid = region;

	}

	@Override
	public String toString() {
		return "\ncountrycode =" + countrycode + " , countryname = " + countryname + " , regionid = " + regionid + "]";
	}

}
