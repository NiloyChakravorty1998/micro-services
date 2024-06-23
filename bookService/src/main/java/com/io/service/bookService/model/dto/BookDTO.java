package com.io.service.bookService.model.dto;

import com.io.service.bookService.model.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
public class BookDTO {
    private Long bookId;
    private String bookName;
    private Integer quantity;
    private String author;
    @Enumerated(EnumType.STRING)
    private Genre genre;
}
