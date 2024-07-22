package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.aurionpro.model.Book;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of books you want to add : ");
		int n =sc.nextInt();
		Book[] books= new Book[n];
		
		System.out.println("Enter the Details of books");
		
		for(int i =0; i <books.length; i++) {
			System.out.println("Book "+(i+1)+ " : " );
			System.out.println("Enter the Book Id : ");
			int bookId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Book Name : ");
			String bookName = sc.next();
			
			System.out.println("Enter the Book Author : ");
			String bookAuthor = sc.next();
		
			System.out.println("Enter the Book Price : " );
			double bookPrice = sc.nextDouble();
			
			books[i] =new Book(bookId, bookName, bookAuthor, bookPrice);
		}
		for(int i = 0; i<books.length; i++) {
			books[i].ShowDetails();
		}
		displayBooksDescendingByPrice(books);
		
		sc.close();
		
	}

	private static void displayBooksDescendingByPrice(Book[] books) {
		Arrays.sort(books, Comparator.comparingDouble(Book::getBookPrice).reversed());

        System.out.println("\nBooks in descending order of price:");
        for (int i = 0; i < books.length; i++) {
            books[i].ShowDetails();
            System.out.println();
        }
		
	}

	
}
