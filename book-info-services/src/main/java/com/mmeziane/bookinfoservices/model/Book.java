package com.mmeziane.bookinfoservices.model;

public class Book {
	
	private String bookId;
	private String authorName;
	private String title;
	
	
	public Book(String bookId, String authorName, String title) {
		this.bookId = bookId;
		this.authorName = authorName;
		this.title = title;
	}
	
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}
