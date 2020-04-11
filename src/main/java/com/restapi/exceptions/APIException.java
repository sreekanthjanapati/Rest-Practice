package com.restapi.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class APIException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { NullPointerException.class, IndexOutOfBoundsException.class })
	public ResponseEntity<?> handleNullPointerExce(Exception ex) {
		System.out.println("Global exception handling - null pointer exception");
		ErrorMessage em = new ErrorMessage(new Date(), ex.getLocalizedMessage());
		return new ResponseEntity<>(em, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(UserServiceExcepiton.class)
	public ResponseEntity<?> handleUserService(UserServiceExcepiton ex) {
		System.out.println("Global exception handling - userservice exception");
		ErrorMessage em = new ErrorMessage(new Date(), ex.getLocalizedMessage());
		return new ResponseEntity<>(em, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<?> handleGeneralExce(Exception ex) {
		System.out.println("Global exception handling - general exception");
		ErrorMessage em = new ErrorMessage(new Date(), ex.getLocalizedMessage());
		return new ResponseEntity<>(em, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
