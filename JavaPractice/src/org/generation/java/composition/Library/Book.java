package org.generation.java.composition.Library;

public class Book {
	// dont want external system to access the values, have to go thru getter and setter
	private String ISBN;
	private String title;
	private String author;

	//Constructor
	public Book(String ISBN, String title, String author)
	{
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}

	//Getter Setter
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}

	public String title() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}

	public String author() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}


	//Override
	public String toString(){
		return String.format("Book title is %s,author is %s ",this.title,this.author);
	}



} // end of class
