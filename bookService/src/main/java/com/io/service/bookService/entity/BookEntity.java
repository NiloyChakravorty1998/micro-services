package com.io.service.bookService.entity;

import com.io.service.bookService.model.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "BOOKS_TBL")
@Entity
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    private String bookName;
    private Integer quantity;
    private String author;
    @Enumerated(EnumType.STRING)
    private Genre genre;
}
