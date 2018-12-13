package com.qa.OOP_Garage;

public class Motorbike extends Vehicle {

	private int mudFlaps;

	public Motorbike(int weight, String colour, int mudFlaps, String name) {
		super(weight, colour, name);
		this.mudFlaps = mudFlaps;
	}

	public int getMudFlaps() {
		return mudFlaps;
	}

	public void setMudFlaps(int mudFlaps) {
		this.mudFlaps = mudFlaps;
	}

	@Override
	public String toString() {
		return "Motorbike [Weight=" + getWeight() + " " + "Colour=" + getColour() + " " + " MudFlaps=" + mudFlaps + " " + "Name=" + getName()  + "]";
	}

}
