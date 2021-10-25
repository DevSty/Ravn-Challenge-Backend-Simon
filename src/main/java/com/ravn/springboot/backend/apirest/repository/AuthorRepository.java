package com.ravn.springboot.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ravn.springboot.backend.apirest.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
		
	
}
