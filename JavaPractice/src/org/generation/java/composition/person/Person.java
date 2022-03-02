package org.generation.java.composition.person;

public class Person {
	//Keep track of what Job this person is doing
	//This Job belong to this person  - Person with one Job
	private String name;
	private int age;

	// Additional property/Attribute, keep track of what job this person is doing
	private Job job;  // One person with one Job -

	//Constructor
	public Person (String name,int age,int id,String role,double salary){

		//part 1 - properties value assign to Person Class
		this.name = name;
		this.age = age;

		//Part 2 - create an instance object of the Job
		// new instance object, pass in parameters from job property
		this.job = new Job(id,role,salary);
		/*
		Jean, 18 has a job of an instructor and earn $1600 per mth
		 */

	} // end of constructor



	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}


	// override
	public String toString(){
		return String.format("My name is %s, I am %d years old ",this.name,this.age) + this.job;
		// this.job returns the toString from the job class
	}
} // end of class
