package com.aurionpro.model;

public class Book {
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	
	public Book() {
		
	}
	public Book(int bookId, String bookName, String bookAuthor, double bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice =  bookPrice;
		
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getBookId() {
		return this.bookId;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return this.bookName;
	}
	
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookAuthor() {
		return this.bookAuthor;
	}
	
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookPrice() {
		return this.bookPrice;
	}
	
	public void ShowDetails() {
		System.out.println("BookId: "+this.bookId);
		System.out.println("Book Name : "+this.bookName);
		System.out.println("Book Author : "+ this.bookAuthor);
		System.out.println("Book Price : "+this.bookPrice);
		System.out.println("-----------------------------------------");
	}
	
}
