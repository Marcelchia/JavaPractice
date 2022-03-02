package org.generation.java.Polymorphism.AbstractClass;

/*
Shape is an abstract class and will be extended from its children.
 (eg. Rectangle, Circle, Triangle, Cylinder, Sphere ....

 Shape class will have a few abstract methods, and all the children inherited from the
 Shape class have to implement the methods on their own.

 Shape class provides a guide for its children of which methods that they must implement
 in order for the completeness of the class
 */

// vague class
public abstract class Shape {           //abstract Class

	public abstract double area();      //abstract Method
	public abstract double perimeter(); //abstract Method

	@Override
	public String toString()
	{
		return String.format(" Area: %.2f, Perimeter: %.2f", area(), perimeter());
	}


}// end of class
