package org.open_library_project.be.book.service.impl;

import lombok.RequiredArgsConstructor;
import org.open_library_project.be.book.model.entity.BookEntity;
import org.open_library_project.be.book.repository.BookRepository;
import org.open_library_project.be.book.service.BookDeleteService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class BookDeleteServiceImpl implements BookDeleteService {

    private final BookRepository bookRepository;

    @Override
    public void deleteBookById(
           final String bookId
    ) {
        BookEntity bookEntity = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("ID degeri belirtilen kitap bulunamadi."));

        bookRepository.delete(bookEntity);
    }
}