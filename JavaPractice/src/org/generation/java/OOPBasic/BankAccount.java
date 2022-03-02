package org.generation.java.OOPBasic;
// 1)create class
//Indirectly, bankaccount class already inherit from object class
// - Java.lang package
// all the class created are object(s)
//Therefore all classes are able to use the methods from object class
// eg toString() method is available in the object class


public class BankAccount {
	//2) declare properties
	final int withdrawLimit = 0;
	final int minBalance = 100;
	int bankAccountID;
	String ownerName;
	double balance;
	char type;

	//Constructor Overloading
	public BankAccount(){
		//Set default constructor
		this.bankAccountID=100;
		this.ownerName="MyName";
		this.balance=100;
		this.type='O';
	}
	//Constructor Overloading with parameters
	public BankAccount(int bankAccountID, String ownerName, char type){
		//Set default constructor
		this.bankAccountID=bankAccountID;
		this.ownerName=ownerName;
		this.balance=minBalance;
		this.type= type;
	}


	//3) Paraterized Constructor
	public BankAccount(int bankAccountID, String ownerName, double balance,	char type){
		// this refer to the instance object that is created
		//this.size refers to property, size refer to parameter passed in
		this.bankAccountID = bankAccountID;
		this.ownerName = ownerName;
		this.balance = balance;
		this.type = type;
	}
//4 Getter and setter
	public int getBankAccountID(){
		// Can do additional checking before the property value back to the caller
		return bankAccountID;
	}

	public void setBankAccountID(int bankAccountID){
		// can do additional checking before editing the property value
		this.bankAccountID = bankAccountID;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public char getType() {
		return type;
	}

	public void setType(char type){
		this.type = type;
	}

	// 5 Other methods to perform business logic
	//deposit
	public void deposit(double depositAmount){
		this.balance += depositAmount;
	}
	//withdraw
	public void withdraw(double withdrawnAmount){

		if (this.balance >= withdrawnAmount){  // account balance has enough fund
			this.balance -= withdrawnAmount;
			System.out.println("Transaction Successful! New Balance $"+ this.balance);
		}
		else {
			System.out.println("Insufficient Funds, please key a lower amount!");
		}
	}

	//transfer
	public void transfer(BankAccount account, double transferAmount) {
		if(this.balance >= transferAmount) {			// sender balance has enough fund
			account.balance += transferAmount;     // recipient receive fund
			this.balance -= transferAmount;        // sender transfer fund
//			this.withdraw(transferAmount);
			System.out.println("Transaction Successful! New Balance $"+ this.balance);
		}
		else {
			System.out.println("Insufficient Funds,please key a lower amount!");
		}
	}



	//Jean Solution

	public boolean withdrawJ(double amount){

		if (this.balance - amount >=0){  // account balance has enough fund
			this.balance -= amount;
		return true;
		}
		return false;  //default value
	}

	/*
		Bank Acc to transfer from, Bank acc to transfer to, amount to transfer
		Bank Acc A will be calling transfer method, and pass in Bank Acc B
		Transfer to Bank Acc B
		 */

	public boolean transferJ( BankAccount accTo ,double amount){
		/*
		this.balance      // this refers to savingAcc, accFrom
		accTo.getBalance   // refers to ordinaryAcc
		*/
		// 1) check balance has enough to deduct from acctFrom (savingsAcc)
		// 2) is there a method available for you to use

		/*
		reuse the method if possible, so if there is a fix,
		 you can always change that method specifically
		 */

		if(this.withdrawJ(amount))   //calling withdraw method
		{
			accTo.deposit(amount); // AcctTo balance will increase
			return true;
		}
			return false;
	}


// this method is usually located at the end of every other methods
	// toString method
	//Object Class is the "mother of all" class
	// All the class(es) that you have created, inherit from the Object Class
	//will be using the toString method inherited from Object Class to return the String
	// representation (Overriding), camelcase
	//System.out.println("Bank Account holder " + savingAccount.getOwnerName() +
	// " Balance: " + savingAccount.getBalance() +" Account type: " + savingAccount.getType());

	//Annotation - more will be covered in the SpringBoot Framework
	/*
	-Java Annotation is a tag that represent metadata of class, method, interface
	-certain information that are very useful and use by the Java compiler and JVM
	 */

	//Overriding a method
	public String toString(){
		return String.format("Bank Account Holder: %s, Balance: $%.2f,  Account Type:" +
			" %c",this.ownerName,this.balance,this.type);
	}

	// if in own class, this.ownerName,
	// if in another class, can use getOwnerName



}  // end of class


