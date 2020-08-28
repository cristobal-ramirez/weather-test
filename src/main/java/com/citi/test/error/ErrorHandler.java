package com.citi.test.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class ErrorHandler {
	/*
	 * ControllerAdvice does the trick handling exceptions  
	 */

   @ExceptionHandler(MissingServletRequestParameterException.class)
   public ResponseEntity<ErrorInfo> missingServletRequestParameterException(HttpServletRequest request, MissingServletRequestParameterException e) {
       ErrorInfo errorInfo = new ErrorInfo(HttpStatus.BAD_REQUEST.value(), e.getMessage(), request.getRequestURI());
       return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
   }
   
   @ExceptionHandler(HttpClientErrorException.class)
   public ResponseEntity<ErrorInfo> httpClientErrorException(HttpServletRequest request, HttpClientErrorException e) {
       ErrorInfo errorInfo = new ErrorInfo(HttpStatus.FORBIDDEN.value(), 
    		   "the parameter 'city' has an empty value", request.getRequestURI());
       return new ResponseEntity<>(errorInfo, HttpStatus.FORBIDDEN);
   }   
}
