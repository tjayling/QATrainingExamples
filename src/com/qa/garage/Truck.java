package com.qa.garage;

public class Truck extends Vehicle {
	public Truck(int value, int ID) {
		super("truck", value, ID);
		this.valueMultiplier = 200;
	}

}
