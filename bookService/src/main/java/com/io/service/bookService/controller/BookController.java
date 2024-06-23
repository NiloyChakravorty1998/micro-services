package com.io.service.bookService.controller;

import com.io.service.bookService.model.dto.BookDTO;
import com.io.service.bookService.model.vo.BookRequestVO;
import com.io.service.bookService.model.vo.BookResponseVO;
import com.io.service.bookService.service.IBookService;
import com.io.service.bookService.util.AppUtility;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1")
public class BookController {
    private final IBookService iBookService;

    @RequestMapping(path = "/book", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllBooks(){
        BookResponseVO ovo = new BookResponseVO();
        ovo.setResponse(
                iBookService.getAllBooks()
        );
        ovo.setResponseId(AppUtility.getResponseId());
        ovo.setTimeStamp(AppUtility.getTimeStamp());
        return new ResponseEntity<>(ovo, HttpStatus.OK);
    }
    @RequestMapping(path = "/book/{bookId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllBooks(@PathVariable Long bookId){
        BookResponseVO ovo = new BookResponseVO();
        ovo.setResponse(
                iBookService.getBookById(bookId)
        );
        ovo.setResponseId(AppUtility.getResponseId());
        ovo.setTimeStamp(AppUtility.getTimeStamp());
        return new ResponseEntity<>(ovo, HttpStatus.OK);
    }

    @RequestMapping(path = "/book", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> saveBook(@RequestBody BookRequestVO ivo){
        BookDTO idto = ivo.getRequest();
        BookResponseVO ovo = new BookResponseVO();
        ovo.setResponse(
                iBookService.saveNewBook(idto)
        );
        ovo.setRequestId(ivo.getRequestId());
        ovo.setResponseId(AppUtility.getResponseId());
        ovo.setTimeStamp(AppUtility.getTimeStamp());
        return new ResponseEntity<>(ovo, HttpStatus.CREATED);
    }

    @RequestMapping(path = "/book", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> deleteBookById(@RequestParam Long bookId){
        BookResponseVO ovo = new BookResponseVO();
        ovo.setResponse(
                iBookService.deleteBookById(bookId)
        );
        ovo.setResponseId(AppUtility.getResponseId());
        ovo.setTimeStamp(AppUtility.getTimeStamp());
        return new ResponseEntity<>(ovo, HttpStatus.CREATED);
    }
}
