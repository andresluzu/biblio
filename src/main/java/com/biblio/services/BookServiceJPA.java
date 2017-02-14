package com.biblio.services;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.biblio.models.Book;

@Transactional
public class BookServiceJPA implements BookService {

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<Book> listBooks() {
		Query query = em.createQuery("SELECT p FROM Book p ORDER BY id");
        return query.getResultList();
	}

	@Override
	public Book findBookById(Long id) {
		return em.find(Book.class, id);
	}

	@Override
	public Book saveBook(Book book) {
		if(book.getId() == null){
			em.persist(book);
		}else{
			em.merge(book);
		}
		return book;
	}

}
