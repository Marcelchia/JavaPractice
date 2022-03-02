package org.generation.java.OOPBasic;

//1 Determine your class for the use case

public class Shoes {

	//2 What are the properties of the Class - how to create the properties
	// The data type of the properties

	// Do not allow other Class or system to directly access the
	// properties to show or edit (Concept of hiding/ Encapsulation)
	double size;
	String color;

	//3 constructor - have more than one constructors
	// parameterized and non parameterized constructor
	// constructor overloading
//Purpose: used to initialized object

	// One Constructor - initialize my shoe instance object with the size and color
	//Declare constructor
	//The first special method that will be called is the constructor of the Class
	//Constructor and Class name must match
	public Shoes(double size, String color){
		// this refer to the instance object that is created
		//this.size refers to property, size refer to parameter passed in
		this.size = size;
		this.color=color;
	}

	//Create the getter and setter methods for the properties
	/*
	We do not set directly to properties,
	Getter and setter methods are used to get and set properties value of the Class
	-double refers to the return type to the caller

	if sensitive info, will need to do checking
	 */

	//Getter Setter

	public double getSize(){
		// Can do additional checking before the property value back to the caller
		return size;
	}

	public void setSize(double size){
		// can do additional checking before editing the property value
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}





}
