package com.ravn.springboot.backend.apirest.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ravn.springboot.backend.apirest.entity.Book;

public interface IBookDao extends JpaRepository<Book, Long>
{
	@Query(value = "select b from Book b left join fetch b.author")
	public List<Book> findAll(Sort sort);
	
	@Query(value = "select b from Book b left join fetch b.author", 
			countQuery ="select count(b) from Book b left join b.author" )
	public Page<Book> findAll(Pageable pageable);
	
	@Query(value = "select b from Book b left join fetch b.author where b.id=:id")
	public Optional <Book> findById(@Param(value = "id") Long id);
	
}
