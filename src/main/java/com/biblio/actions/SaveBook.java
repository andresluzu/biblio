package com.biblio.actions;

import com.biblio.models.Book;
import com.biblio.models.Language;
import com.biblio.services.BookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

@SuppressWarnings("serial")
public class SaveBook extends ActionSupport implements Preparable{

	private final BookService bookService;
	
	//Parámetros entrada
	private Long id;
	private String title;
	private String description;
	private String author;
	private Integer year;
	private Language language;
	
	//Parámetros de salida
	private Book book;
	private Language[] languages = Language.values();
	
	public SaveBook(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@Override
	public void prepare() throws Exception {
		Long bookId =  ActionContext.getContext().getSession().containsKey("bookId") ? 
				(Long) ActionContext.getContext().getSession().get("bookId") : null;
		if(bookId != null){
			book = bookService.findBookById(bookId);
		}
	}
	
	@Override
	public String execute() throws Exception {
		book = bookService.saveBook(new Book(id, title, description, author, year, language));
		return SUCCESS;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long Id) {
		this.id = Id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Language[] getLanguages() {
		return languages;
	}

			
}
