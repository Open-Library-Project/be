package org.open_library_project.be.book.service.impl;

import lombok.RequiredArgsConstructor;
import org.open_library_project.be.book.model.dto.book.request.BookUpdateRequest;
import org.open_library_project.be.book.model.entity.BookEntity;
import org.open_library_project.be.book.repository.BookRepository;
import org.open_library_project.be.book.service.BookUpdateService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class BookUpdateServiceImpl implements BookUpdateService {
    private final BookRepository bookRepository;

    @Override
    public BookEntity updateBook(
            final String bookId, final BookUpdateRequest bookUpdateRequest
    ) {
        final BookEntity existingBook = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Id değeri belirtilen kitap bulunamadı" + bookId));
        existingBook.setName(bookUpdateRequest.getName());
        existingBook.setPageSize(bookUpdateRequest.getPageSize());
        return bookRepository.save(existingBook);
    }
}
