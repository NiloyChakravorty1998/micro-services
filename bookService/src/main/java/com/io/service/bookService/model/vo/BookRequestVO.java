package com.io.service.bookService.model.vo;

import com.io.service.bookService.model.dto.BookDTO;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class BookRequestVO extends BaseVO{
    private BookDTO request;
}
