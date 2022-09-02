package com.oops.bll;

public class Author {
	private String firstName;
	private String lastName;
	private String bookName;

	public Author() {
		
	}
		
	public Author (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Author (String firstName, String lastName, String bookName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}
	//getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getBookName() {
		return bookName;
	}
	//setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Author FirstName : "+ firstName+ "\nAuthor LastName :  "+lastName+ "\nBookName : "+ bookName;
	}
	}




