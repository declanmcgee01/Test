package com.qa.OOP_Garage;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Garage g = new Garage();

		Vehicle car = new Car(10, "Red", 4, "Toyota");
		Vehicle motorbike = new Motorbike(2, "Black", 2, "Harley");
		Vehicle fireTruck = new FireTruck(20, "Red", 700, "BigRed");
		Vehicle car1 = new Car(15, "Red", 6, "Ford");
		Vehicle motorbike1 = new Motorbike(3, "Black", 2, "Yamaha");
		Vehicle fireTruck1 = new FireTruck(10, "Red", 400, "BiggerRed");

		g.addToList(car);
		g.addToList(motorbike);
		g.addToList(fireTruck);
		g.addToList(car1);
		g.addToList(motorbike1);
		g.addToList(fireTruck1);

		g.printInfoFromList();
		System.out.println();
		g.fixVehicle("Yamaha");
		System.out.println();
		g.removeVehicle("Toyota");
		System.out.println();
		g.emptyGarage();
		
	}
}
