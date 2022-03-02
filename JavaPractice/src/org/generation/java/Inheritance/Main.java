package org.generation.java.Inheritance;

public class Main {
	public static void main(String[] args) {
		// Create instance objects for Manager and Specialists
		Manager manager = new Manager(111,"Marcel Chia",1800,1,"ProductManager");
		Specialist specialist = new Specialist(222,"Tom Tan",1000,
			'S',"Senior Manager","React");

		System.out.println(manager);
		System.out.println(specialist);

		// to edit
		manager.setName("Jenny");   //method in parent
		manager.setSalary(2500);		//method in parent
		manager.setRoleLevel(2);		//method in own class

		System.out.println(manager.getName()); // user the overriding method
		System.out.println(specialist.getName());


	} // end of void
} // end of main
