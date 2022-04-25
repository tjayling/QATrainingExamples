package com.qa.garage;

public class Vehicle {

	private String type;
	private int ID;
	protected int value;
	protected int valueMultiplier;
	protected double bill;

	public Vehicle(String type, int value, int ID) {
		this.type = type;
		this.value = value;
		this.ID = ID;
	}

	public void calculateBill() {
		bill = value * valueMultiplier;
	}

	// GETTERS AND SETTERS FOR THE BILL
	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	// GETTER FOR THE VEHICLE ID
	public int getID() {
		return ID;
	}

	// GETTER FOR THE TYPE OF VEHICLE
	public String getType() {
		return type;
	}

	// GETTER FOR THE VALUE OF THE CAR
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", ID=" + ID + ", value=" + value + ", valueMultiplier=" + valueMultiplier
				+ ", bill=" + bill + "]";
	}

}
