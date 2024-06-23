package com.io.service.bookService.service;

import com.io.service.bookService.model.dto.BookDTO;
import com.io.service.bookService.model.vo.BookRequestVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IBookService {
    List<BookDTO> getAllBooks();
    BookDTO getBookById(Long bookId);
    BookDTO saveNewBook(BookDTO book);
    String deleteBookById(Long bookId);
}
