package com.qa.OOP_Garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public void printInfoFromList() {
		vehicleList.stream().forEach(System.out::println);
	}

	public void addToList(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}

	public void removeVehicle(String name) {

		vehicleList.removeIf(p -> name.equals(p.getName()));
	}
	
	public void emptyGarage()
	{
		vehicleList.clear();
	}

	public void fixVehicle(String name) {

		int bill;

		for (Vehicle v : vehicleList) {

			if (v instanceof Car && v.getName().equals(name)) {
				int doors;
				int weight;
				doors = ((Car) v).getDoors();
				weight = ((Car) v).getWeight();
				bill = doors * weight;
				System.out.println("Bill for Car " + v.getName() + " £" + bill);
			}
			if (v instanceof Motorbike && v.getName().equals(name)) {
				int mudFlaps;
				int weight;
				mudFlaps = ((Motorbike) v).getMudFlaps();
				weight = ((Motorbike) v).getWeight();
				bill = mudFlaps * weight;
				System.out.println("Bill for Motorbike " + v.getName() + " £" + bill);
			}
			if (v instanceof FireTruck && v.getName().equals(name)) {
				int waterTankSize;
				int weight;
				waterTankSize = ((FireTruck) v).getWaterTankSize();
				weight = ((FireTruck) v).getWeight();
				bill = waterTankSize * weight;
				System.out.println("Bill for Fire Truck " + v.getName() + " £" + bill);
			}

		}

	}

}
