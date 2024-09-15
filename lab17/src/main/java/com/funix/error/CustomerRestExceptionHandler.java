package com.funix.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> exceptionNotFound(CustomerNotFoundException exc){
		CustomerErrorResponse errorResponse = new CustomerErrorResponse();
		
		errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		errorResponse.setMessage(exc.getMessage());
		errorResponse.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
	}
}
