package com.springboot.day17springbootrelations;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler
{
@ExceptionHandler(value= {Exception.class})

public ResponseEntity<Object> handlerError(Exception ex,WebRequest req)
{
	String responseData="<h1 style='color:red'>some error occurred</h1>";
	
	return handleExceptionInternal(ex,responseData,new HttpHeaders(),HttpStatus.OK,req);
	
}
}
