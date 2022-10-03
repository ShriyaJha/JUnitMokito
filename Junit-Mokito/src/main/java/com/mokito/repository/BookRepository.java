package com.mokito.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.mokito.entity.Book;


public interface BookRepository extends CrudRepository<Book, Integer>{
	
	public List<Book> findByName(String name);

}