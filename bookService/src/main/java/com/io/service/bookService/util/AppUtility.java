package com.io.service.bookService.util;

import com.io.service.bookService.entity.BookEntity;
import com.io.service.bookService.model.dto.BookDTO;

import java.util.Date;


public class AppUtility {
    public static BookDTO getDTO(BookEntity entity){
        BookDTO dto= BookDTO.builder().bookId(entity.getBookId())
                .author(entity.getAuthor()).bookName(entity.getBookName())
                .genre(entity.getGenre()).quantity(entity.getQuantity()).build();
        return dto;
    }

    public static BookEntity getENTITY(BookDTO dto){
        BookEntity entity = BookEntity.builder().bookId(dto.getBookId())
                .author(dto.getAuthor()).bookName(dto.getBookName())
                .genre(dto.getGenre()).quantity(dto.getQuantity()).build();
        return entity;
    }

    public static String getRequestId(){
        String requestId = "book-req : " +System.currentTimeMillis();
        return requestId;
    }
    public static String getResponseId(){
        String responseId = "book-res : " +System.currentTimeMillis();
        return responseId;
    }

    public static Date getTimeStamp(){
        Date date = new Date();
        return date;
    }
}
