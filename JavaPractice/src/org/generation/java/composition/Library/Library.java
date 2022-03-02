package org.generation.java.composition.Library;
import java.util.ArrayList;
import java.util.List;

public class Library {
	private String branchID;
	//Store a lists of collection of Book Objects - String,Integer,Character
	//Store a lists of collection of Member Objects
	//This example is using array List


	//Interface to specify what a class must do
	//this class must implement these methods, such add(), get(),remove(),size()
	//standardise the methods to be implemented for each class
	//ArrayList implements List, LinkedList implements List, using generic link interface


	//members = new LinkedList<>();
	//members = new ArrayList<>();
	List<Book> books;
 	List<Member> members;


	//constructor
	public Library(){
		this.branchID = branchID;
		//1) Create books and store into the Lists of Books - Books info should be retrieve from database
		//2) Create 3 books for now since no database
		Book book1 = new Book("213-111-111","Effective Java","Marcel");
		Book book2 = new Book("113-141-333","Effective HTML","John");
		Book book3 = new Book("131-161-555","Effective CSS","Jenny");

		books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);

		//1) Create members and store into the Lists of Members - Members info should be retrieve from database
		//2) Create 3 members for now since no database
		Member member1 = new Member("S1111112A","Marcel Chia",18);
		Member member2 = new Member("S1222233B","Jean Chong",25);
		Member member3 = new Member("S1333333C","Martial Anthony",36);

		members = new ArrayList<>();
		members.add(member1);
		members.add(member2);
		members.add(member3);

	} // end of constructor

	//Getter and Setter
	public String getBranchID(){
		return branchID;
	}
	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	// create a getter for the list of books - return the lists of books to display
	public List<Book> getBooksFromLibrary(){
		return this.books;
	}
	public List<Member> getMembersFromLibrary(){
		return this.members;
	}



	// create a getter for the list of members - return the lists of members to display



}// end of class
