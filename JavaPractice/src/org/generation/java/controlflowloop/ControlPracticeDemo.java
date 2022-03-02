package org.generation.java.controlflowloop;
import java.security.spec.ECFieldF2m;
import java.util.Scanner;

public class ControlPracticeDemo {
	// set up is only for practice purpose.
	//By default, one project folder (eg JavaPracticeFile only have 1 main method)

	public static void main(String[] args){

		System.out.println("This is for the practice of control flow and loop");

		//Example 1 check if customer is old enough to make a purchase at e-commerce website
		//customer need to be 18 and above

		/*

		final int ageLimit = 18;
		int age = 15; //enter by customer or retrieve from database
		String message  = "Customer is too young, unable to make the purchase";
		String message2  = "Customer is able to make the purchase";


		if(age < ageLimit){
			System.out.println("Customer is too young, unable to make the purchase");
		}
		else{
			System.out.println("Customer is able to make the purchase");
		}

		//ternary operator
		String result = (age < ageLimit) ? message:message2;
		System.out.println(result);


		 */
		//Practice 1
		//EX1

		int age = 16;
		if(age >= 18){
			System.out.println("Customer is old enough to carry out purchases");
		}
		else{
			System.out.println("Customer is too young to make purchase");
		}

		//EX2

		Scanner userWord = new Scanner (System.in);
		System.out.println("Enter your name");
		//Get user input as string

		String wordEntry = userWord.nextLine();
		System.out.println("Hi " + wordEntry);

		Scanner score = new Scanner (System.in);
		System.out.println("now enter your score");
		int scoreEntry = Integer.parseInt(score.nextLine());


//usually use for single value, bolean

//		switch (scoreEntry) {
//			case (scoreEntry >= 85):
//				System.out.println("Congrats you scored A");
//				break;
//			case (scoreEntry >= 75):
//				System.out.println("Good Job, you scored B");
//				break;
//			case (scoreEntry >= 50):
//				System.out.println("Good Job, you scored C");
//				break;
//			case (scoreEntry >= 0):
//				System.out.println("You have failed, Please come see me");
//				break;
//			default:
//				System.out.println("Looking forward to the Weekend");
//		}
//
		if(scoreEntry >= 85){
			System.out.println(" Congrats "+ wordEntry +" , you scored A ");
		}
		else if(scoreEntry >= 75){
			System.out.println("Good Job "+ wordEntry +", you scored B");
		}
		else if(scoreEntry >= 50){
			System.out.println("You have passed "+ wordEntry +", you scored C");
		}
		else if(scoreEntry >= 0){
			System.out.println("You have failed "+ wordEntry +", Please come see me");
		}
		else{
			System.out.println( wordEntry +" please key a valid score from 0-100");
		}


		//Practice2


		Scanner season = new Scanner (System.in);
		System.out.println("Hi " + wordEntry + " please key in the season 1-4");
		int seasonNumber = Integer.parseInt(season.nextLine());
		switch (seasonNumber) {
			case 1:
				System.out.println("Winter");
				break;
			case 2:
				System.out.println("Spring");
				break;
			case 3:
				System.out.println("Summer");
				break;
			case 4:
				System.out.println("Autumn");
				break;
			default:
				System.out.println("Out of bound, please input 1-4");
		}

		Scanner mth = new Scanner (System.in);
		System.out.println("Hi " + wordEntry + " please key in the mth");
		int mthNumber = Integer.parseInt(mth.nextLine());

		switch (mthNumber) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("Please input 1-12");
		}














	}
}
