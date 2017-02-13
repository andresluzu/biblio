package com.biblio.actions;

import com.biblio.models.Book;
import com.biblio.services.BookService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ViewBookDetail extends ActionSupport {

	private BookService bookService = new BookService();
	
	//Parámetros entrada
	private Long bookId;
	
	//Parámetros de salida
	private Book book;
	
	@Override
	public void validate() {
		if(bookId == null){
			addActionError(getText("error.book.notFound"));
		}
		super.validate();
	}
	
	@Override
	public String execute() throws Exception {
		book = bookService.findBookById(bookId);
		if(book == null){
			addActionError(getText("error.book.notFound"));
			return INPUT;
		}
		return SUCCESS;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Book getBook() {
		return book;
	}

		
}
