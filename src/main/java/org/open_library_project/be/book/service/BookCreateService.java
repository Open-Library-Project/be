package org.open_library_project.be.book.service;

import org.open_library_project.be.book.model.dto.book.request.BookCreateRequest;
import org.open_library_project.be.book.model.entity.BookEntity;

public interface BookCreateService {
    BookEntity create(
            final BookCreateRequest bookCreateRequest
    );
}
