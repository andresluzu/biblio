package com.biblio.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.biblio.models.Book;
import com.biblio.models.Language;

@Component
public class BookServiceMemory implements BookService {

	private static Map<Long, Book> books = new HashMap<>();
	static {
		books.put(1L, new Book(1L, "Moby-Dick", "", "Herman Melville", 1851, Language.EN));
		books.put(2L, new Book(2L, "Hamlet", "", "William Shackespeare", 1603, Language.EN));
		books.put(3L, new Book(3L, "Cien a�os de soledad", "", "Gabriel Garc�a Marquez", 1967, Language.ES));
		books.put(4L, new Book(4L, "Divina Comedia", "", "Danta Alighieri", 1265, Language.IT));
		books.put(5L, new Book(5L, "El extranjero", "", "Albert Camus", 1942, Language.FR));
	}
	
	@Override
	public Collection<Book> listBooks(){
		return books.values();
	}
	
	@Override
	public Book findBookById(Long id){
		return books.get(id);
	}
	
	@Override
	public Book saveBook(Book book){
		if(book.getId() != null && books.containsKey(book.getId())){
			books.put(book.getId(), book);
		}else{
			Long id = new Long(books.size() + 1);
			book.setId(id);
			books.put(id, book);
		}
		return book;
	}
}
