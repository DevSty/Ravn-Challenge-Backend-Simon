package com.ravn.springboot.backend.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravn.springboot.backend.apirest.entity.Author;
import com.ravn.springboot.backend.apirest.service.AuthorService;

@RestController
@RequestMapping("/api/author")
public class AuthorController {
	
	private final AuthorService authorService;
	
	@Autowired
	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
	}

	@GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Author findById(@PathVariable Long id) {
		return this.authorService.findById(id);
	}
	
	@GetMapping(value = "/pageable", produces = {MediaType.APPLICATION_JSON_VALUE}) 
	public Page<Author> findAllPageable(Pageable pageable){
		return this.authorService.findAllPageable(pageable);
	}

}
