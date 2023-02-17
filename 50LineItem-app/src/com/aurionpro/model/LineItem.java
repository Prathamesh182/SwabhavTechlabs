package com.aurionpro.model;

public class LineItem {
	private int id;
	private String name;
	private int quantity;
	private double 	unitprice;
	private double total;
	
	public LineItem(int id, String name, int quantity, double unitprice) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitprice = unitprice;
		
	}

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitprice() {
		return unitprice;
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", name=" + name + ", quantity=" + quantity + ", unitprice= " + unitprice + " cost="+calculateCost()+ "]\n";
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	public double calculateCost() {
		return quantity*unitprice;
	}
	
}
