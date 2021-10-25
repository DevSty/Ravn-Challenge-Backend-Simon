package com.ravn.springboot.backend.apirest.exceptions;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 586997922820211117L;
	private final String resourceName;
	private final String fieldName;
	private final String fieldValue;
	
	@JsonIgnore
	private String stackTrace;

	public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
		super(String.format("%s no encontrado con %s : %s", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}
	
	
	
	

}
