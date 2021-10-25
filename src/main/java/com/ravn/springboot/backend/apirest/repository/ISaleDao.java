package com.ravn.springboot.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravn.springboot.backend.apirest.entity.Sale;

public interface ISaleDao extends JpaRepository<Sale, Long> {

	
	
}
