package org.open_library_project.be.book.service;

import org.open_library_project.be.book.model.dto.book.request.BookUpdateRequest;
import org.open_library_project.be.book.model.entity.BookEntity;

public interface BookUpdateService {
    BookEntity updateBook(
            final String bookId, BookUpdateRequest bookUpdateRequest
    );
}
