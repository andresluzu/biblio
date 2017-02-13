package com.biblio.models;

public class Book {

	private Long id;
	private String title;
	private String description;
	private String author;
	private Integer year;
	private Language language;
	
	public Book() {
		super();
	}
	
	public Book(Long id, String title, String description, String author, Integer year, Language language) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.author = author;
		this.year = year;
		this.language = language;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
}
