package org.generation.java.Polymorphism.Interface;

public interface Vehicle {
	/*
	Provides a guide for classes that implements the interface that they must implement
	all the methods that the interface had

	-provide/guarantees a uniform fashion way - and useful for creating a set of web services.
	- only have abstract methods for the children to implement
	- cannot have its own implementation of method for interface
	 */

	// all are the abstract methods.
	void changeGear(int gear);
	void speedUp(int speed);
	void applyBrakes(int brakes);

}
