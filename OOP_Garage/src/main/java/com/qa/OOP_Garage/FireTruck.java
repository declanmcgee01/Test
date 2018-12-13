package com.qa.OOP_Garage;

public class FireTruck extends Vehicle {

	private int waterTankSize;

	public FireTruck(int weight, String colour, int waterTankSize, String name) {
		super(weight, colour, name);
		this.waterTankSize = waterTankSize;
	}

	public int getWaterTankSize() {
		return waterTankSize;
	}

	public void setWaterTankSize(int waterTankSize) {
		this.waterTankSize = waterTankSize;
	}

	@Override
	public String toString() {
		return "Firetruck [Weight=" + getWeight() + " " + "Colour=" + getColour() + " " + " Water Tank Size=" + waterTankSize + " "
				+ "Name= " + getName() + " " + "]";
	}

}
