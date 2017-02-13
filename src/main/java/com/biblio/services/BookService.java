package com.biblio.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.biblio.models.Book;
import com.biblio.models.Language;

public class BookService {

	private static Map<Long, Book> books = new HashMap<>();
	static {
		books.put(1L, new Book(1L, "Moby-Dick", "", "Herman Melville", 1851, Language.EN));
		books.put(2L, new Book(2L, "Hamlet", "", "William Shackespeare", 1603, Language.EN));
		books.put(3L, new Book(3L, "Cien años de soledad", "", "Gabriel García Marquez", 1967, Language.ES));
		books.put(4L, new Book(4L, "Divina Comedia", "", "Danta Alighieri", 1265, Language.IT));
		books.put(5L, new Book(5L, "El extranjero", "", "Albert Camus", 1942, Language.FR));
	}
	
	public Collection<Book> listBooks(){
		return books.values();
	}
}
