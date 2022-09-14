package com.assessment.EmployeeManagement2.exception.controlleradvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.assessment.EmployeeManagement2.exception.EmployeeAlreadyExistsException;

@ControllerAdvice
public class EmployeeControllerAdvice {
	
	@ExceptionHandler(EmployeeAlreadyExistsException.class)
	public ResponseEntity<String> handleEmployeeAlreadyExistsException(EmployeeAlreadyExistsException employeeAlreadyExistsException){
		return new ResponseEntity<String>("Employee Already Exists", HttpStatus.BAD_REQUEST);
	}
}
