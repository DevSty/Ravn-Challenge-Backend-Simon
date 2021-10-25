package com.ravn.springboot.backend.apirest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ravn.springboot.backend.apirest.entity.Author;

public interface AuthorService {
	
	Author findById(Long id);
	
	Page<Author> findAllPageable(Pageable pageable);

}
