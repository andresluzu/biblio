package com.biblio.services;

import java.util.Collection;

import com.biblio.models.Book;

public interface BookService {

	Collection<Book> listBooks();

	Book findBookById(Long id);

	Book saveBook(Book book);

}