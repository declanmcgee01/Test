package com.qa.OOP_Garage;

public class Car extends Vehicle {

	private int doors;


	public Car(int weight, String colour, int doors, String name) {
		super(weight, colour, name);
		this.doors = doors;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	@Override
	public String toString() {
		return "Car [Weight=" + getWeight() + " " + "Colour=" + getColour() + " " + " Doors=" + doors + " " + "Name ="
				+ getName() + "]";
	}

}
