package org.open_library_project.be.book.controller;

import lombok.RequiredArgsConstructor;
import org.open_library_project.be.book.model.dto.book.request.BookCreateRequest;
import org.open_library_project.be.book.model.dto.book.request.BookUpdateRequest;
import org.open_library_project.be.book.model.entity.BookEntity;
import org.open_library_project.be.book.service.BookCreateService;
import org.open_library_project.be.book.service.BookService;
import org.open_library_project.be.book.service.BookUpdateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final BookCreateService bookCreateService;
    private final BookService bookService;
    private final BookUpdateService bookUpdateService;

    @PostMapping
    public BookEntity createBook(
            @RequestBody final BookCreateRequest bookCreateRequest
    ) {
        return bookCreateService.create(bookCreateRequest);
    }

    @GetMapping("/book/{bookId}")
    public BookEntity getById(
            @PathVariable("bookId") final String bookId
    ) {
        return bookService.getBookById(bookId);
    }

    @GetMapping("/get-all")
    public List<BookEntity> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PutMapping("/update/{bookId}")
    public BookEntity updateBook(
            @PathVariable("bookId") final String bookId,
            @RequestBody final BookUpdateRequest bookUpdateRequest
    ) {
        return bookUpdateService.updateBook(bookId, bookUpdateRequest);
    }
}
