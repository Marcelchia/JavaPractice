package org.generation.java.OOPBasic;

public class Main {
	public static void main(String[] args) {
		// Create 3 instance objects of the Shoe Class (sportshoe,sandals, highheels)
		// if its the same package, no need to import
		Shoes sport = new Shoes(6,"blue");   // first thing will call constructor
		Shoes sandal = new Shoes(8,"brown");
		Shoes highHeel = new Shoes(7,"white");

		// sport.size= 8 ;  // not advisable to change here due to privacy
		// Access the size and color of the instance object through the getter and setter method

		System.out.println("Sport Shoes Size " + sport.getSize() + " color " + sport.getColor());
		System.out.println("Sandal Size" + sandal.getSize() + " color " + sandal.getColor());
		System.out.println("High Heel Size" + highHeel.getSize() + " color " + highHeel.getColor());

		highHeel.setSize(8);
		highHeel.setColor("Black");
		System.out.println("Edited High Heel Size" + highHeel.getSize() + " color " + highHeel.getColor());

		//Bank Account Example

		// can mouseover to see the sequence
		BankAccount ordinaryAccount = new BankAccount(6111,"Marcel",1000,'O');
		BankAccount savingAccount = new BankAccount(7772,"Marcel",10000,'S');
		BankAccount investmentAccount = new BankAccount(8123,"Marcel",5000,'I');

		//Constructor Overloading

		BankAccount oAnyoneAccount = new BankAccount();
		BankAccount oAnotherAccount = new BankAccount(321,"Another Name",'S');



		// calling the toString method from the class, system.out.println will call toString() from class
		System.out.println(ordinaryAccount);
		System.out.println(savingAccount);

		ordinaryAccount.deposit(1000);
		System.out.println(ordinaryAccount);

		// Ex Withdrawal

		//Success
		System.out.println("======= Withdrawal =========");
		ordinaryAccount.withdraw(100);
		System.out.println(ordinaryAccount);
		//Fail
		System.out.println("============================");
		ordinaryAccount.withdraw(3000);
		System.out.println(ordinaryAccount);




		// Ex Transfer
		//Succeed
		// transfer 1000 from ordinary account to saving account

		System.out.println("===========Transfer==============");
		ordinaryAccount.transfer(savingAccount,1000);
		System.out.println(ordinaryAccount);
		System.out.println(savingAccount);

		//Fail
		//transfer 100000 from savings account to ordinary account
		System.out.println("==================================");
		savingAccount.transfer(ordinaryAccount,100000);
		System.out.println(ordinaryAccount);
		System.out.println(savingAccount);

		////////////////////////////////////===========================//////////////////////////////////////////


		// Withdraw Jean Ans
		/*
		Jean wants to withdraw 3000 or 500 from O account
		Display output to the front-end show to the user from the browser
		Usually other class to handle the display ( view, database , controller MVC)
		 */

		if(ordinaryAccount.withdrawJ(500))
		{
			System.out.println("Successfully withdrawn from bank account");
		}
		else{
			System.out.println("Error deducting from balance");
		}

		System.out.println(ordinaryAccount);
		System.out.println(savingAccount);



		// Transfer Jean Ans
		/*
		Jean wants to do a fund transfer of 3000 from saving acc to ordinary acc
		savingAccount.transfer(ordinaryAccount,3000);

		 */
		if(savingAccount.transferJ(ordinaryAccount,3000))
		{
			System.out.println("Successfully Transferred from the bank accounts");
		}
		else {
			System.out.println(ordinaryAccount);
			System.out.println(savingAccount);
		}


	}  // static void



}  // class
