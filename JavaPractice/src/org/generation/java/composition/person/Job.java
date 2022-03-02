package org.generation.java.composition.person;
// create class
public class Job {

	private String role;  // default access modifier
	private double salary;
	private int id;

	// Constructor
	public Job(int id, String role, double salary)
	{
			this.id = id;
			this.role = role;
			this.salary=salary;
	}

	//Getter and Setter
	public int getId() {
		return id;
	}
	public void setId() {
		this.id=id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary() {
		this.salary=salary;
	}

	//Override
	public String toString(){
		return String.format(" Job role is %s, and salary is $%.2f ",this.role,this.salary);
	}






} // end of class
