package com.ravn.springboot.backend.apirest.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ravn.springboot.backend.apirest.entity.Author;
import com.ravn.springboot.backend.apirest.exceptions.ResourceNotFoundException;
import com.ravn.springboot.backend.apirest.repository.AuthorRepository;
import com.ravn.springboot.backend.apirest.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

	private final AuthorRepository authorRepository;
	
	@Autowired
	public AuthorServiceImpl(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@Override
	@Transactional(readOnly = true)
	public Author findById(Long id) {
		return this.authorRepository.findById(id)
		.orElseThrow(() -> new ResourceNotFoundException("/author", "id", id.toString()));
	}

	@Override
	public Page<Author> findAllPageable(Pageable pageable) {
		Page<Author> pageAuthors = this.authorRepository.findAll(pageable);
		
		if (pageAuthors.getContent().isEmpty()) {
			throw new ResourceNotFoundException("auhors", "id", "todos");
		}
		
		return pageAuthors;
	}

}
