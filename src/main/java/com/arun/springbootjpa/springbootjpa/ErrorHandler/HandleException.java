package com.arun.springbootjpa.springbootjpa.ErrorHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.function.EntityResponse;

@RestControllerAdvice
public class HandleException {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Object> handleException(IllegalArgumentException e){

        return new ResponseEntity<>("Invalid Request Data", HttpStatus.BAD_REQUEST);
    }
}
