package com.biblio.actions;

import java.util.Collection;

import com.biblio.models.Book;
import com.biblio.services.BookService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ListBooks extends ActionSupport {

	private BookService bookService = new BookService();
	private Collection<Book> books;
	
	@Override
	public String execute() throws Exception {
		books = bookService.listBooks();
		return SUCCESS;
	}

	public Collection<Book> getBooks() {
		return books;
	}
	
	
}
