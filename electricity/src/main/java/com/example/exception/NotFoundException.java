package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
	
	String resourceName;
	String fieldName;
	Long fieldValue;
  
	public NotFoundException(String resourceName, String fieldName, Long fieldValue) {
    
	  super(String.format("%s not found with %s: %s",fieldName,  fieldName, fieldValue));
	  
	  this.resourceName = resourceName;
	  this.fieldName = fieldName;
	  this.fieldValue = fieldValue;

  }
}
