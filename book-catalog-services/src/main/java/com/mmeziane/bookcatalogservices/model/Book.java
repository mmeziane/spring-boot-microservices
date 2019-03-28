package com.mmeziane.bookcatalogservices.model;

public class Book {
	
	private int bookId;
	private String authorName;
	private String title;
	
	
	public Book(int bookId, String authorName, String title) {
		this.bookId = bookId;
		this.authorName = authorName;
		this.title = title;
	}
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
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
