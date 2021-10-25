package com.ravn.springboot.backend.apirest.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.ravn.springboot.backend.apirest.entity.Book;

public interface IBookService 
{

	public List<Book> findAll(Sort sort);
	
	public Page<Book> findAll(Pageable pageable);
	
	public Book findById(long id);
	
	public void delete(long id);
	
	public Book save(Book book);
	
}
