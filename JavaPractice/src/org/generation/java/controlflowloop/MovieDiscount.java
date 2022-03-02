package org.generation.java.controlflowloop;
import java.util.Scanner;

//Practice 4
public class MovieDiscount {
	public static void main(String[] args){

		int ageInput = 0;
		int quantityInput = 0;
		boolean checkAgeInputError = true;
		boolean checkQuantityInputError = true;
		double price = 7;
		double discountGiven = 0.0;
		double totalPrice = 0.0;
		Scanner scannerInt = new Scanner(System.in);


		//try catch for Age input

		do {
			try {
				System.out.println("Please enter your age: ");
				ageInput = Integer.parseInt(scannerInt.nextLine());

				// if else ageInput > 100, ageInput < 0
				if (ageInput <= 0 || ageInput > 100) {
					System.out.println("Please enter a valid age");
				} else {
					checkAgeInputError = false;
					// age check try
				}
			}
			catch (NumberFormatException e )
			{
				System.out.println("Error. Please input a integer");
			}

		}while(checkAgeInputError);



		// age input if else for discount

		if(ageInput > 60){
			discountGiven = 0.55;
			totalPrice = (1-discountGiven)* price;
		}
		else if (ageInput < 5) {
			discountGiven = 0.60;
			totalPrice = (1-discountGiven)* price;
		}

			else { // people between 5 and 60

				// try catch for ticket quantity input
				do {
					try {
						System.out.println("How many tickets would you wanna purchase: ");
						quantityInput = Integer.parseInt(scannerInt.nextLine());
						// if else ageInput > 100, ageInput < 0
						if (quantityInput <= 0 ) {
							System.out.println("Please enter a positive integer");
						} else {
							checkQuantityInputError = false;
							// age check try
						}
					}
					catch (NumberFormatException e)
					{
						System.out.println("Error. Please input a integer");
					}

				}while(checkQuantityInputError);

				// end of do while loop

			//if else condition to check for how many pax

			if(quantityInput >= 3){
				discountGiven = 0.3;
				totalPrice = (quantityInput * price) * (1-discountGiven);
			}
			else{
				totalPrice = (quantityInput * price);
			}
			}  // end else statement for normal price with 3 or more tickets
		 System.out.println(String.format("Your ticket cost is $%.2f ",totalPrice));
	}  // end of public static
}  // end of class
