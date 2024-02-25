package org.open_library_project.be.book.controller;

import lombok.RequiredArgsConstructor;
import org.open_library_project.be.book.model.dto.book.request.BookCreateRequest;
import org.open_library_project.be.book.model.entity.BookEntity;
import org.open_library_project.be.book.service.BookCreateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final BookCreateService bookCreateService;

    @PostMapping
    public BookEntity createBook(
            @RequestBody final BookCreateRequest bookCreateRequest
    ) {
        return bookCreateService.create(bookCreateRequest);
    }

}
