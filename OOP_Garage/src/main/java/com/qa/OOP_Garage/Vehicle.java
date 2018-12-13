package com.qa.OOP_Garage;

public abstract class Vehicle {

	private int weight;
	private String colour;
	private String name;

	public Vehicle(int weight, String colour, String name) {
		this.weight = weight;
		this.colour = colour;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
