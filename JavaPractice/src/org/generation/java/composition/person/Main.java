package org.generation.java.composition.person;

// which class depends on which class

public class Main {
	public static void main(String[] args) {

		Person marcelChia = new Person("Marcel Chia",18,111,"teacher",1600);
		System.out.println(marcelChia);

		Person philvey = new Person("Phil Ivey",40,222,"poker player",1000000);
		System.out.println(philvey);




	} // end of void
} // end of class
