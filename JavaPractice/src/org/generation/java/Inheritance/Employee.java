package org.generation.java.Inheritance;

public class Employee {
	// The '_' is to indicate that the attribute is hidden, and we cannot access the
	//attribute directly
	// properties

	/*
	have to create the parent class first then the child class
	adv: support code reusability and help to reduce error and length of codes
	 */



	private int _id;
	private String _name;
	private double _salary;

	// constructor
	public Employee(int id , String name, double salary)
	{
		this._id = id;
		this._name = name;
		this._salary = salary;
	}

	//getter and setter

	public int getId() {
		return _id;
	}
	public void setID(int id){
		this._id = id;
	}

	public String getName() {
		return _name;
	}
	public void setName(String name){
		this._name = name;
	}


	public double getSalary() {
		return _salary;
	}
	public void setSalary(double salary){
		this._salary = salary;
	}



	@Override
	public String toString(){
		return String.format("Employee ID:%d, Name: %s , salary: %.2f ",this._id,this._name,this._salary);
	}
}  // end of class
