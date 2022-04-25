package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicle> myVehicles;
	private int currentID;

	public Garage() {
		this.myVehicles = new ArrayList<>();
		addVehicle("car", 52);
		addVehicle("car", 12);
		addVehicle("truck", 67);
		addVehicle("motorbike", 33);
		addVehicle("motorbike", 9);
		this.currentID = getID();
	}

	public void addVehicle(String type, int value) {
		switch (type) {
		case "car":
			myVehicles.add(new Car(value, currentID));
			currentID++;
			break;

		case "motorbike":
			myVehicles.add(new Motorbike(value, currentID));
			currentID++;
			break;

		case "truck":
			myVehicles.add(new Truck(value, currentID));
			currentID++;
			break;

		default:
			System.out.println("That is not a type of vehicle.");
			break;
		}
	}

	public void getVehicles() {
		for (Vehicle v : myVehicles) {
			System.out.println("Vehicle: " + v.getID());
			System.out.println("Type: " + v.getType());
			System.out.println("Value: " + v.getValue());
			System.out.println("Class: " + v.getClass());
		}
	}

	public void calculateBill() {
		for (Vehicle v : myVehicles) {
			v.calculateBill();
		}
	}

	public void removeVehicle(int ID) {
		for (int i = 0; i < myVehicles.size(); i++) {
			if (myVehicles.get(i).getID() == ID) {
				myVehicles.remove(i);
			}
		}
	}

	public void removeVehicle(String type) {
		for (int i = 0; i < myVehicles.size(); i++) {
			if (myVehicles.get(i).getType().equals(type)) {
				myVehicles.remove(i);
			}
		}
	}

	public double fixVehicle(int ID) {
		for (Vehicle v : myVehicles) {
			if (v.getID() == ID) {
				return v.getBill();
			}
		}
		return (0d);
	}

	public void emptyGarage() {
		myVehicles = new ArrayList<>();
	}

	// METHOF THAT RETURNS THE NEXT AVAILABLE ID
	public int getID() {
		return myVehicles.get(myVehicles.size() - 1).getID() + 1;
	}

	@Override
	public String toString() {
		return "Garage [myVehicles=" + myVehicles + ", currentID=" + currentID + "]";
	}

}
