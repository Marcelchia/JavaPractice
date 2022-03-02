package org.generation.java.composition.Library;
import java.util.List;

public class Main {
	public static void main(String[] args) {


		//books and members will be created
		Library tampinesNLB = new Library();
		tampinesNLB.setBranchID("tampines01");

		//Display the list of books in this library
		List<Book> books = tampinesNLB.getBooksFromLibrary();

		for(Book book:books) {
			System.out.println(book);
		}

		//Display the list of members from this library
		List<Member> members = tampinesNLB.getMembersFromLibrary();
		for(Member member:members) {
			System.out.println(member);
		}




	} // end of void
} // end of class
