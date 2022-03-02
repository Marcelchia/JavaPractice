package org.generation.java.Polymorphism.Interface;


public class Main {
	public static void main(String[] args) {

// List course = new ArrayList <>();

//		 creating an instance of Bicycle
//		 doing some operations

		Vehicle bicycle = new Bicycle(2,3);
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBrakes(1);

		System.out.println("Bicycle present state :");
		System.out.println(bicycle);

		// creating instance of the bike.
		Vehicle bike = new Bike(2,3);
		bike.changeGear(1);
		bike.speedUp(4);
		bike.applyBrakes(3);

		System.out.println("Bike present state :");
		System.out.println(bike);


	} // end of void
} // end of class

