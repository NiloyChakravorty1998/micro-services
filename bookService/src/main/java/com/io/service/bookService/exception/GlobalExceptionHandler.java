package com.io.service.bookService.exception;

import com.io.service.bookService.model.vo.BookResponseVO;
import com.io.service.bookService.util.AppUtility;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {BookServiceException.class})
    public ResponseEntity<Object> handleBookServiceException(BookServiceException ex){
        BookResponseVO ovo = new BookResponseVO();
        BookServiceException evo = new BookServiceException(ex.getMessage(), ex.getCause(), ex.getErrorCode());
        ovo.setResponseId(AppUtility.getResponseId());
        ovo.setException(evo);
        return new ResponseEntity<>(ovo, HttpStatus.BAD_REQUEST);
    }
}
