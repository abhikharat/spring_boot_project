package com.abhi.userservice.advice;

import java.util.NoSuchElementException;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.abhi.userservice.exception.BaseException;

@ControllerAdvice
public class MyControllerAdvice {
	
	private static final Logger LOG=LoggerFactory.getLogger(MyControllerAdvice.class);
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<?> handleNoSuchElementException(NoSuchElementException exception,WebRequest request){
		
		LOG.error("handleNoSuchElementException "+exception.getMessage());
		
		BaseException error=new BaseException("Fauiler",exception.getMessage());
		
		return new ResponseEntity(error,null, HttpStatus.SC_NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> handleGlobleExceptions(Exception exception,WebRequest request){
		
		LOG.error("handleGlobleExceptions "+exception.getMessage());
		
		BaseException error=new BaseException("Fauiler",exception.getMessage());
		
		return new ResponseEntity(error,null, HttpStatus.SC_INTERNAL_SERVER_ERROR);
	}
	

}
