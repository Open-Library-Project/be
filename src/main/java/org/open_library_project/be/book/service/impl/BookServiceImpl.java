package org.open_library_project.be.book.service.impl;

import lombok.RequiredArgsConstructor;
import org.open_library_project.be.book.model.entity.BookEntity;
import org.open_library_project.be.book.repository.BookRepository;
import org.open_library_project.be.book.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    @Override
    public BookEntity getBookById(
            final String bookId
    ) {
        return bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Bu id'ye sahip bir BookEntity bulunamadı!"));
    }

    @Override
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }
}
