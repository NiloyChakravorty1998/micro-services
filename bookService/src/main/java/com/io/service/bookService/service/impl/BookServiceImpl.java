package com.io.service.bookService.service.impl;

import com.io.service.bookService.exception.BookServiceException;
import com.io.service.bookService.model.dto.BookDTO;
import com.io.service.bookService.repo.BookRepository;
import com.io.service.bookService.service.IBookService;
import com.io.service.bookService.util.AppUtility;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Log4j2
public class BookServiceImpl implements IBookService {
    private final BookRepository repo;

    @Override
    public List<BookDTO> getAllBooks() {
        List<BookDTO> list = repo.findAll()
                             .stream().map(AppUtility::getDTO)
                                .collect(Collectors.toList());
        return list;
    }

    @Override
    public BookDTO getBookById(Long bookId) {
        return repo.findById(bookId).map(AppUtility::getDTO)
                .orElseThrow(() -> new BookServiceException("Book Not found : " + bookId, "BOOK_NOT_FOUND"));
    }

    @Override
    public BookDTO saveNewBook(BookDTO book) {
        BookDTO dto = AppUtility.getDTO(repo.save(AppUtility.getENTITY(book)));
        return dto;
    }

    @Override
    public String deleteBookById(Long bookId) {
        repo.deleteById(bookId);
        return "Book deleted : " +bookId;
    }
}
