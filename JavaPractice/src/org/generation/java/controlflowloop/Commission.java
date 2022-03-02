package org.generation.java.controlflowloop;
import java.util.Scanner;

public class Commission {
	public static void main(String args[])
	{
		boolean checkInputError = true;
		double commission = 0.0;  //global variable
		double userCommission = 0.0;
		int userInput = 0;
		Scanner scanner = new Scanner(System.in);
		//try and catch

		//exception handling, throw an error
		//needs to be in a do while loop
		do {
			try {
				//try statement allow you to define a block of code to be tested for any errors while it is being executed
				System.out.println("Please enter your sales figure: ");
				//userInput is expecting an integer
				userInput = Integer.parseInt(scanner.nextLine());// capture user input, parseInt converts to integer
//				userInput = scanner.nextInt();
				//catch(InputMismatchInteger e)
				//if parseInt method throws an exception, whatever code after method will not be executed
				// and immediately will go into catch block.
				checkInputError = false;
			} catch (NumberFormatException e) {
				//catch statement allow to define a block of code to be executed if an error occurs in the try block
				//if there is no error in try then catch will not execute
				System.out.println("Error. Please print out a number");
			}

		}while(checkInputError);


		//wrapper Class - Integer (Cover in Collection) provided by Java package , wrap up a primitive data type as object

		if(userInput > 10000){
			commission = 0.3;
		}
	else if (userInput >=5000){
			commission = 0.2;
		}
	else if(userInput >=1000){
			commission = 0.1;
		}
	else{  //optional
		commission = 0.0;
	}

	userCommission = userInput * commission;
	System.out.println(String.format("Your commission is $%.2f,",userCommission));
	}
}
