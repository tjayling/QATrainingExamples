package com.qa.garage;

public class Motorbike extends Vehicle {
	public Motorbike(int value, int ID) {
		super("motorbike", value, ID);
		this.valueMultiplier = 150;
	}
}
