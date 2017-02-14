package com.biblio.actions;

import com.biblio.models.Book;
import com.biblio.models.Language;
import com.biblio.services.BookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ViewBookForm extends ActionSupport {

	private final BookService bookService;
	
	//Parámetros entrada
	private Long bookId;
	
	//Parámetros de salida
	private Book book;
	private Language[] languages = Language.values();
	
	public ViewBookForm(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@Override
	public String execute() throws Exception {
		if(bookId != null){
			book = bookService.findBookById(bookId);
			ActionContext.getContext().getSession().put("bookId", bookId);
		}else{
			book = new Book();
			ActionContext.getContext().getSession().remove("bookId");
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

	public Language[] getLanguages() {
		return languages;
	}

		
}
