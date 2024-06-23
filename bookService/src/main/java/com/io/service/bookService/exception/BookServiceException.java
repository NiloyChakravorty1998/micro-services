package com.io.service.bookService.exception;

import lombok.Data;

@Data
public class BookServiceException extends RuntimeException{
    private Throwable cause;
    private String errorCode;

    public BookServiceException(String message, Throwable cause, String errorCode) {
        super(message);
        this.cause = cause;
        this.errorCode = errorCode;
    }
    public BookServiceException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

}
