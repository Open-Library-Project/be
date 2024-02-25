package org.open_library_project.be.book.service;


import org.open_library_project.be.book.model.entity.BookEntity;

import java.util.List;

public interface BookService {
    BookEntity getBookById(
            final String bookId
    );
    List<BookEntity> getAllBooks();
}
