package com.boilerplate.blog.exception;

import com.boilerplate.blog.common.dto.ErrorResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResource> handleResourceNotFoundException(ResourceNotFoundException exception,
                                                                         WebRequest request) {
        ErrorResource responseData = new ErrorResource(
                request.getDescription(false),
                exception.getMessage());
        return new ResponseEntity<>(responseData, HttpStatus.NOT_FOUND);
    }
}
