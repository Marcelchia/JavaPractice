package org.generation.java;

import java.util.Objects;
import java.util.Scanner;

public class Main {
	/*
	Program(Java Compiler will start its execution through main() method (entry point)

	public, protected, private - known as Access Modifier
	(who as in other Classes can access current class or methods

	static method -JVM Java virtue Machine or other program/class
	are able to call the static method without initializing the Class
	(do not need to create instance object of the class)


	void - whatever datatype that is in front of method refers to the return type
	(e.g - return int, String, Collection)
	- void refers to the method is not returning anything

	*/
	// by right only have 1
    public static void main(String[] args) {
	// write your code here
//			System.out.println("Hello World. I am Marcel");
//
//			//Non premitive
//			String name = "Marcel Chia";
//			String myID = "ABC123";
//			//primitive data type
//			//used to store a single entity
//			int age = 18;
//			final char gender = 'M';
//			float salary = 1600.0f; // 6 to 7 dp
//			boolean isHungry = true;
//			byte serialNumber = 100;
//			double price = 2000.50d; //15 dp
//			double cost = 3500.25; //compileer treat this variable as double
//
//			age = 25; //reassign variable
//			//gender = 'M'  //Cannot reassign value for final variable
//
//			System.out.println("Hi my name is "+ name + " I am "+ age + " year old " +
//				"my gender is " + gender + " hungry status: " + isHungry);
//			System.out.println(name.charAt(0));
//
//			String display = String.format("Hi my name is %s,%s, my age is %d years old. "
//				+"my gender is %c and my hungry status is %b",name,myID,age,gender,isHungry);
//			System.out.println(display);
//
//			//input
//			Scanner userName = new Scanner (System.in);
//			System.out.println("Enter your username");
//			//Get user input as string
//
//			String userEntry = userName.nextLine();
//			System.out.println("Username is " + userEntry);

			//Practice 1

			//EX1

			String name = "marcel chia";
			int age = 16;
			String email = "marcel.chiayl@gmail.com";


			System.out.println("my name is "+ name + ". My age is "+ age + " and " +
				"my email is " + email);


			//EX2

			String display = String.format("my name is %s. My age is %d and my email is %s",name,age,email);

			System.out.println(display);


			//EX3


		final char myGender = 'M';
		boolean isJavaFun = true;
		float myFloat = 1.5f; // 6 to 7 dp
		double myDouble = 99.99d; //15 dp
		float mySalary = 1500.50f;

		String display2 = String.format("my gender is %c and my salary is %f Java is fun! %b",myGender,mySalary,isJavaFun);

		System.out.println(display2);


			//Practice 2
			//EX1
			// can use var
			int originalPrice = 10;
			float gst = 0.07f;
			double cost=13.7;
			//double cost = 13.7   cannot re-declare
			//cost = 10;  can re assign

			float priceWithGST = originalPrice * (1 + gst);

			System.out.println("The cost is "+ originalPrice + ". The final cost is "+ priceWithGST);
			//$.%2f put in string 2 d p

			//EX2
			String CorrectWord = "Marcel";

			Scanner userWord = new Scanner (System.in);
			System.out.println("Enter the word");
			//Get user input as string

			String wordEntry = userWord.nextLine();
//		System.out.println("word entry is " + wordEntry);
//		System.out.println("CorrectWord is " + CorrectWord);

//			if(wordEntry == CorrectWord)
			// if(wordEntry.equals(CorrectWord))
			if(Objects.equals(wordEntry, CorrectWord)) {
				System.out.println("You keyed the correct word");
			}
			else{
				System.out.println("Try Again");
			}
    }
}
