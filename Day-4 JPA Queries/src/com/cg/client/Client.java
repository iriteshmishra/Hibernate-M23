package com.cg.client;

import com.cg.entities.Book;
import com.cg.service.BookService;
import com.cg.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		BookService service=new BookServiceImpl();
		 
		System.out.println("***** Listing total number of books*****");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("***** Listing book with id 104*****");
		System.out.println("Book with ID 104:"+service.getBookById(104));
		
		System.out.println("*****Listing All books*****");
		for(Book b:service.getAllBooks()) {
			System.out.println(b);
		}
		
		System.out.println("*****Listing book written by Robert Fischer*****");
		for(Book b:service.getBookByAuthor("Robert Fischer")) {
			System.out.println(b);
		}
		
		System.out.println("*****Listing All Books between 300 and 600*****");
		for(Book b:service.getBookRange(300.00, 600.00)) {
			System.out.println(b);
		}

	}

}
